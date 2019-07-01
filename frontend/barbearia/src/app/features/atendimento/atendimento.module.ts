import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AtendimentoFormComponent } from './views/atendimento-form/atendimento-form.component';
import { AtendimentoListComponent } from './views/atendimento-list/atendimento-list.component';

@NgModule({
  declarations: [AtendimentoFormComponent, AtendimentoListComponent],
  imports: [
    CommonModule
  ]
})
export class AtendimentoModule { }
