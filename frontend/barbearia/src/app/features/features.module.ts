import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FeaturesRouterModule } from './features.routing';
import { FreguesModule } from './fregues/fregues.module';
import { FuncionarioModule } from './funcionario/funcionario.module';
import { ServicoModule } from './servico/servico.module';
import { AtendimentoModule } from './atendimento/atendimento.module';
import { RouterModule } from '@angular/router';

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    FeaturesRouterModule,
    FreguesModule,
    FuncionarioModule,
    ServicoModule,
    AtendimentoModule
  ],
  exports: [
    RouterModule
  ]
})
export class FeaturesModule { }
