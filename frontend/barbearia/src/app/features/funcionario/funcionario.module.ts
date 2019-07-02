import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FuncionarioFormComponent } from './views/funcionario-form/funcionario-form.component';
import { FuncionarioListComponent } from './views/funcionario-list/funcionario-list.component';
import { FuncionarioRouterModule } from './funcionario.routing';
import { TableModule } from 'primeng/table';
import { CardModule } from 'primeng/card';
import { ButtonModule } from 'primeng/button';
import { ReactiveFormsModule } from '@angular/forms';
import { InputTextModule } from 'primeng/inputtext';
import { KeyFilterModule } from 'primeng/keyfilter';
import { CalendarModule } from 'primeng/calendar';
import { RadioButtonModule } from 'primeng/radiobutton';
import { MessageService } from 'primeng/api';
import { MessageModule } from 'primeng/message';
import { ToastModule } from 'primeng/toast';
import { FuncionarioResolver } from './views/funcionario-form/funcionario.resolver';

@NgModule({
  declarations: [FuncionarioFormComponent, FuncionarioListComponent],
  imports: [
    CommonModule,
    FuncionarioRouterModule,
    CardModule,
    ButtonModule,
    TableModule,
    ReactiveFormsModule,
    InputTextModule,
    KeyFilterModule,
    CalendarModule,
    RadioButtonModule,
    MessageModule,
    ToastModule
  ],
  providers: [
    MessageService,
    FuncionarioResolver
  ]
})
export class FuncionarioModule { }
