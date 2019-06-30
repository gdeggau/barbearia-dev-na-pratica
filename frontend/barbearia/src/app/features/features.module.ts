import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FeaturesRouterModule } from './features.routing';
import { FreguesModule } from './fregues/fregues.module';
import { RouterModule } from '@angular/router';
import { ItemModule } from './item/item.module';

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    FeaturesRouterModule,
    FreguesModule,
    ItemModule,
  ],
  exports: [
    RouterModule
  ]
})
export class FeaturesModule { }
