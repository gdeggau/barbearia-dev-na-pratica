import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ClienteFormComponent } from './views/cliente-form/cliente-form.component';
import { ClienteListComponent } from './views/cliente-list/cliente-list.component';
import { ClienteResolver } from './views/cliente-form/cliente.resolver';

const routes: Routes = [{
  path: 'cliente',  children: [
    {
      path: 'create', component: ClienteFormComponent
    },
    {
      path: 'list', component: ClienteListComponent
    },
    {
      path: 'edit/:id', component: ClienteFormComponent, resolve: [ClienteResolver]
    }
  ]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class ClienteRouterModule { }
