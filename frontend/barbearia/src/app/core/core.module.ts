import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FreguesModule } from './entities/fregues/fregues.module';
import { FuncionarioModule } from './entities/funcionario/funcionario.module';
import { ServicoModule } from './entities/servico/servico.module';
import { AtendimentoModule } from './entities/atendimento/atendimento.module';

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    FreguesModule,
    FuncionarioModule,
    ServicoModule,
    AtendimentoModule
  ]
})
export class CoreModule { }
