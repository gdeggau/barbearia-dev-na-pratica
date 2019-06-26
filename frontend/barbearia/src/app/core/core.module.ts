import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ClienteModule } from './entities/cliente/cliente.module';
import { ItemModule } from './entities/item/item.module';

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    ClienteModule,
    ItemModule
  ]
})
export class CoreModule { }
