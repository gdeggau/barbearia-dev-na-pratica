import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ItemFormComponent } from './views/item-form/item-form.component';
import { ItemListComponent } from './views/item-list/item-list.component';
import { ItemResolver } from './views/item-form/item.resolver';

const routes: Routes = [{
  path: 'item',  children: [
    {
      path: 'create', component: ItemFormComponent
    },
    {
      path: 'list', component: ItemListComponent
    },
    {
      path: 'edit/:id', component: ItemFormComponent, resolve: [ItemResolver]
    }
  ]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class ClienteRouterModule { }
