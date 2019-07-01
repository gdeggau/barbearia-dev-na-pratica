import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FuncionarioFormComponent } from './views/funcionario-form/funcionario-form.component';
import { FuncionarioListComponent } from './views/funcionario-list/funcionario-list.component';

@NgModule({
  declarations: [FuncionarioFormComponent, FuncionarioListComponent],
  imports: [
    CommonModule
  ]
})
export class FuncionarioModule { }
