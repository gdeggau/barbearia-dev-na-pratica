import { NgModule } from '@angular/core';
import { PermissionsModule } from '@seniorsistemas/platform-components';
import { FreguesService } from './fregues.service';

@NgModule({
  imports: [
    PermissionsModule.forChild([
      {
        name: 'fregues',
        actions: ['Visualizar', 'Incluir', 'Editar', 'Excluir'],
        uri: `res://senior.com.br/erpx_arq/acme/entities/fregues`,
      },
    ])
  ],
  providers: [
    FreguesService,
  ],
  declarations: [
  ],
  exports: [
  ]
})
export class FreguesModule {}
