import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [{
  path: 'fregueses', redirectTo: 'fregues/list'
},
{
  path: 'items', redirectTo: 'item/list'
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class FeaturesRouterModule { }
