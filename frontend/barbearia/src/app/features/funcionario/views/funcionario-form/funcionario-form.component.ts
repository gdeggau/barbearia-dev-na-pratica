import { Component, OnInit, Input } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { Funcionario } from 'src/app/core/entities/funcionario/funcionario';
import { FuncionarioService } from 'src/app/core/entities/funcionario/funcionario.service';
import { catchError, takeUntil } from 'rxjs/operators';
import { throwError, Subject } from 'rxjs';
import { Router, ActivatedRoute } from '@angular/router';
import { MessageService } from 'primeng/api';

@Component({
  selector: 'app-funcionario-form',
  templateUrl: './funcionario-form.component.html'
})
export class FuncionarioFormComponent implements OnInit {
  public funcionarioForm: FormGroup;
  @Input() funcionario: Funcionario;
  private routeParams: any;
  private ngUnsubscribe = new Subject();

  constructor(
    private funcionarioService: FuncionarioService,
    private formBuilder: FormBuilder,
    private router: Router,
    private messageService: MessageService,
    private route: ActivatedRoute
    ) { }

  ngOnInit() {

    this.funcionarioForm = this.getFormGroup();

    this.route.params.pipe(takeUntil(this.ngUnsubscribe)).subscribe((params: any) => this.onRouteParamsChange(params));
    this.route.data.pipe(takeUntil(this.ngUnsubscribe)).subscribe((data: any) => this.onRouteDataChange(data));

  }

  private getFormGroup() {
    return this.formBuilder.group({
      nome: new FormControl(undefined, Validators.compose([Validators.required])),
      dataNascimento: new FormControl(undefined, Validators.compose([Validators.required])),
      email: new FormControl(undefined, Validators.compose([Validators.required])),
      cpf: new FormControl(undefined, Validators.compose([Validators.required])),
      telefone: new FormControl(undefined, Validators.compose([Validators.required])),
      endereco: new FormControl(undefined, Validators.compose([Validators.required]))
    });
  }

  private validateAllFormFields(formGroup: FormGroup) {
    Object.keys(formGroup.controls).forEach(field => {
        const control = formGroup.get(field);
        if (control instanceof FormControl) {
          control.markAsDirty({ onlySelf: true });
        } else if (control instanceof FormGroup) {
          this.validateAllFormFields(control);
        }
    });
  }

  public onSave() {
    if (!this.funcionarioForm.valid) {
      return this.validateAllFormFields(this.funcionarioForm);
    }

    this.getSaveObservable()
    .pipe(
      catchError((err: any) => {
      console.log(err);
      return throwError(err);
    })
    ).subscribe(() => {
      this.goBack();
      console.log(`Saved`);
    });
  }

  public isNew() {
    return this.routeParams.id === undefined;
  }

  private goBack() {
    const previousRoute = '/funcionario/list';
    this.router.navigate([previousRoute], { relativeTo: this.route.parent });
  }

  public onRouteDataChange(data: any) {
    const entity = data[0];
    if (data[0]) {
        const value: any = Funcionario.fromDto(entity);
        this.funcionarioForm.patchValue(value);
    } else {
        this.funcionarioForm.patchValue(new Funcionario());
    }
  }

  public onRouteParamsChange(params: any) {
    this.routeParams = params;
}

  private getSaveObservable() {
    const { value } = this.funcionarioForm;
    const funcionarioDto = Funcionario.toDto(value);

    let observable;

    if (this.isNew()) {
        observable = this.funcionarioService.insert(funcionarioDto);
        this.messageService.add({
          key: 'form-toast',
          severity: 'success',
          summary: `Sucesso!`,
          detail: `O funcionário foi inserido com sucesso!`
        });
    } else {
        const id = this.routeParams.id;
        observable = this.funcionarioService.update(id, funcionarioDto);
    }

    return observable;
  }

}