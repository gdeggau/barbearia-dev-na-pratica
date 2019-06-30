import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FreguesModule } from './entities/fregues/fregues.module';
import { ItemModule } from './entities/item/item.module';

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    FreguesModule,
    ItemModule
  ]
})
export class CoreModule { }
