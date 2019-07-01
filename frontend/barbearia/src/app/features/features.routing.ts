import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [{
  path: 'fregueses', redirectTo: 'fregues/list'
},
{
  path: 'funcionarios', redirectTo: 'funcionario/list'
},
{
  path: 'servicos', redirectTo: 'servico/list'
},
{
  path: 'atendimentos', redirectTo: 'atendimento/list'
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class FeaturesRouterModule { }
