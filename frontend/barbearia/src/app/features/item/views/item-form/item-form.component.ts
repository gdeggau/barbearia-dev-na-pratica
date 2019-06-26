import { Component, OnInit, Input } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { Cliente } from 'src/app/core/entities/cliente/cliente';
import { ClienteService } from 'src/app/core/entities/cliente/cliente.service';
import { catchError, takeUntil } from 'rxjs/operators';
import { throwError, Subject } from 'rxjs';
import { Router, ActivatedRoute } from '@angular/router';
import { MessageService } from 'primeng/api';
import { Item } from 'src/app/core/entities/item/item';
import { ItemService } from 'src/app/core/entities/item/item.service';

@Component({
  selector: 'app-cliente-form',
  templateUrl: './item-form.component.html',
})
export class ItemFormComponent implements OnInit {
  public itemForm: FormGroup;
  @Input() item: Item;
  private routeParams: any;
  private ngUnsubscribe = new Subject();

  constructor(
    private temService: ItemService,
    private formBuilder: FormBuilder,
    private router: Router,
    private messageService: MessageService,
    private route: ActivatedRoute
    ) { }

  ngOnInit() {

    this.itemForm = this.getFormGroup();

    this.route.params.pipe(takeUntil(this.ngUnsubscribe)).subscribe((params: any) => this.onRouteParamsChange(params));
    this.route.data.pipe(takeUntil(this.ngUnsubscribe)).subscribe((data: any) => this.onRouteDataChange(data));

  }

  private getFormGroup() {
    return this.formBuilder.group({
      descricao: new FormControl(undefined, Validators.compose([Validators.required])),
      quantidade: new FormControl(undefined, Validators.compose([Validators.required])),
      valorUnitario: new FormControl(undefined, Validators.compose([Validators.required])),
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
    if (!this.itemForm.valid) {
      return this.validateAllFormFields(this.itemForm);
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
    const previousRoute = '/item/list';
    this.router.navigate([previousRoute], { relativeTo: this.route.parent });
  }

  public onRouteDataChange(data: any) {
    const entity = data[0];
    if (data[0]) {
        const value: any = Cliente.fromDto(entity);
        this.itemForm.patchValue(value);
    } else {
        this.itemForm.patchValue(new Item());
    }
  }

  public onRouteParamsChange(params: any) {
    this.routeParams = params;
}

  private getSaveObservable() {
    const { value } = this.itemForm;
    const clienteDto = Cliente.toDto(value);

    let observable;

    if (this.isNew()) {
        observable = this.temService.insert(clienteDto);
        this.messageService.add({
          key: 'form-toast',
          severity: 'success',
          summary: `Sucesso!`,
          detail: `O cliente foi inserido com sucesso!`
        });
    } else {
        const id = this.routeParams.id;
        observable = this.temService.update(id, clienteDto);
    }

    return observable;
  }

}
