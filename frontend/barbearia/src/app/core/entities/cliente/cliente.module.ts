import { NgModule } from '@angular/core';
import { PermissionsModule } from '@seniorsistemas/platform-components';
import { ClienteService } from './cliente.service';

@NgModule({
    imports: [
        PermissionsModule.forChild([
            {
                name: 'cliente',
                actions: ['Visualizar', 'Incluir', 'Editar', 'Excluir'],
                uri: `res://senior.com.br/erpx_arq/acme/entities/cliente`,
            },
        ]),
    ],
    providers: [
      ClienteService,
    ],
    declarations: [
    ],
    exports: [
    ],

})
export class ClienteModule {}
