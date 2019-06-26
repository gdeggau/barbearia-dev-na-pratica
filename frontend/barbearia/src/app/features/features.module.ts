import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FeaturesRouterModule } from './features.routing';
import { ClienteModule } from './cliente/cliente.module';
import { RouterModule } from '@angular/router';
import { ItemModule } from './item/item.module';

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    FeaturesRouterModule,
    ClienteModule,
    ItemModule,
  ],
  exports: [
    RouterModule
  ]
})
export class FeaturesModule { }
