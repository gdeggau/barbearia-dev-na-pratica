import { NgModule } from '@angular/core';
import { PermissionsModule } from '@seniorsistemas/platform-components';
import { FuncionarioService } from './funcionario.service';

@NgModule({
  imports: [
    PermissionsModule.forChild([
      {
        name: 'funcionario',
        actions: ['Visualizar', 'Incluir', 'Editar', 'Excluir'],
        uri: `res://senior.com.br/erpx_arq/acme/entities/funcionario`,
      },
    ])
  ],
  providers: [
    FuncionarioService
  ],
  declarations: [
  ],
  exports: [
  ]
})
export class FuncionarioModule { }
