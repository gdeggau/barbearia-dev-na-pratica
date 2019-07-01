import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FuncionarioFormComponent } from './views/funcionario-form/funcionario-form.component';
import { FuncionarioListComponent } from './views/funcionario-list/funcionario-list.component';
import { FuncionarioResolver } from './views/funcionario-form/funcionario.resolver';

const routes: Routes = [{
  path: 'funcionario',  children: [
    {
      path: 'create', component: FuncionarioFormComponent
    },
    {
      path: 'list', component: FuncionarioListComponent
    },
    {
      path: 'edit/:id', component: FuncionarioFormComponent, resolve: [FuncionarioResolver]
    }
  ]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class FuncionarioRouterModule { }
