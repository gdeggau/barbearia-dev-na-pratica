import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FreguesFormComponent } from './views/fregues-form/fregues-form.component';
import { FreguesListComponent } from './views/fregues-list/fregues-list.component';
import { FreguesRouterModule } from './fregues.routing';
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
import { FreguesResolver } from './views/fregues-form/fregues.resolver';

@NgModule({
  declarations: [FreguesFormComponent, FreguesListComponent],
  imports: [
    CommonModule,
    FreguesRouterModule,
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
    FreguesResolver
  ]
})
export class FreguesModule { }
