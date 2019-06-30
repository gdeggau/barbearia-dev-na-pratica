import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FreguesFormComponent } from './views/fregues-form/fregues-form.component';
import { FreguesListComponent } from './views/fregues-list/fregues-list.component';
import { FreguesResolver } from './views/fregues-form/fregues.resolver';

const routes: Routes = [{
  path: 'fregues',  children: [
    {
      path: 'create', component: FreguesFormComponent
    },
    {
      path: 'list', component: FreguesListComponent
    },
    {
      path: 'edit/:id', component: FreguesFormComponent, resolve: [FreguesResolver]
    }
  ]
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class FreguesRouterModule { }
