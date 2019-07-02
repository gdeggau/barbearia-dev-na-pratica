import { Component, OnInit, Input } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { Servico } from 'src/app/core/entities/servico/servico';
import { ServicoService } from 'src/app/core/entities/servico/servico.service';
import { catchError, takeUntil } from 'rxjs/operators';
import { throwError, Subject } from 'rxjs';
import { Router, ActivatedRoute } from '@angular/router';
import { MessageService } from 'primeng/api';

@Component({
  selector: 'app-servico-form',
  templateUrl: './servico-form.component.html'
})
export class ServicoFormComponent implements OnInit {
  public servicoForm: FormGroup;
  @Input() servico: Servico;
  private routeParams: any;
  private ngUnsubscribe = new Subject();

  constructor(
    private servicoService: ServicoService,
    private formBuilder: FormBuilder,
    private router: Router,
    private messageService: MessageService,
    private route: ActivatedRoute
    ) { }

  ngOnInit() {

    this.servicoForm = this.getFormGroup();

    this.route.params.pipe(takeUntil(this.ngUnsubscribe)).subscribe((params: any) => this.onRouteParamsChange(params));
    this.route.data.pipe(takeUntil(this.ngUnsubscribe)).subscribe((data: any) => this.onRouteDataChange(data));

  }

  private getFormGroup() {
    return this.formBuilder.group({
      nome: new FormControl(undefined, Validators.compose([Validators.required])),
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
    if (!this.servicoForm.valid) {
      return this.validateAllFormFields(this.servicoForm);
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
    const previousRoute = '/servico/list';
    this.router.navigate([previousRoute], { relativeTo: this.route.parent });
  }

  public onRouteDataChange(data: any) {
    const entity = data[0];
    if (data[0]) {
        const value: any = Servico.fromDto(entity);
        this.servicoForm.patchValue(value);
    } else {
        this.servicoForm.patchValue(new Servico());
    }
  }

  public onRouteParamsChange(params: any) {
    this.routeParams = params;
}

  private getSaveObservable() {
    const { value } = this.servicoForm;
    const servicoDto = Servico.toDto(value);

    let observable;

    if (this.isNew()) {
        observable = this.servicoService.insert(servicoDto);
        this.messageService.add({
          key: 'form-toast',
          severity: 'success',
          summary: `Sucesso!`,
          detail: `O serviço foi inserido com sucesso!`
        });
    } else {
        const id = this.routeParams.id;
        observable = this.servicoService.update(id, servicoDto);
    }

    return observable;
  }

}
