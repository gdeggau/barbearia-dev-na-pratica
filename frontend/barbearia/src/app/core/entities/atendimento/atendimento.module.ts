import { NgModule } from '@angular/core';
import { PermissionsModule } from '@seniorsistemas/platform-components';
import { AtendimentoService } from './atendimento.service';

@NgModule({
  imports: [
    PermissionsModule.forChild([
      {
        name: 'atendimento',
        actions: ['Visualizar', 'Incluir', 'Editar', 'Excluir'],
        uri: `res://senior.com.br/erpx_arq/acme/entities/atendimento`,
      },
    ])
  ],
  providers: [
    AtendimentoService
  ],
  declarations: [
  ],
  exports: [
  ]
})
export class AtendimentoModule { }
