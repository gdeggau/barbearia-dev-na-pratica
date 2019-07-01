import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ServicoFormComponent } from './views/servico-form/servico-form.component';
import { ServicoListComponent } from './views/servico-list/servico-list.component';
import { ServicoResolver } from './views/servico-form/servico.resolver';

const routes: Routes = [{
  path: 'servico',  children: [
    {
      path: 'create', component: ServicoFormComponent
    },
    {
      path: 'list', component: ServicoListComponent
    },
    {
      path: 'edit/:id', component: ServicoFormComponent, resolve: [ServicoResolver]
    }
  ]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class ServicoRouterModule { }
