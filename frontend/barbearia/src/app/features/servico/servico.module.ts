import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ServicoFormComponent } from './views/servico-form/servico-form.component';
import { ServicoListComponent } from './views/servico-list/servico-list.component';
import { ServicoRouterModule } from './servico.routing';
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
import { ServicoResolver } from './views/servico-form/servico.resolver';

@NgModule({
  declarations: [ServicoFormComponent, ServicoListComponent],
  imports: [
    CommonModule,
    ServicoRouterModule,
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
    ServicoResolver
  ]
})
export class ServicoModule { }
