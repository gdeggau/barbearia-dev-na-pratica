import { NgModule } from '@angular/core';
import { PermissionsModule } from '@seniorsistemas/platform-components';
import { ServicoService } from './servico.service';

@NgModule({
  imports: [
    PermissionsModule.forChild([
      {
        name: 'servico',
        actions: ['Visualizar', 'Incluir', 'Editar', 'Excluir'],
        uri: `res://senior.com.br/erpx_arq/acme/entities/servico`,
      },
    ])
  ],
  providers: [
    ServicoService
  ],
  declarations: [
  ],
  exports: [
  ]
})
export class ServicoModule { }
