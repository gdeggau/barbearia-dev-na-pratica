import { NgModule } from '@angular/core';
import { PermissionsModule } from '@seniorsistemas/platform-components';
import { ItemService } from './item.service';

@NgModule({
    imports: [
        PermissionsModule.forChild([
            {
                name: 'item',
                actions: ['Visualizar', 'Incluir', 'Editar', 'Excluir'],
                uri: `res://senior.com.br/erpx_arq/acme/entities/fregues`,
            },
        ]),
    ],
    providers: [
      ItemService,
    ],
    declarations: [
    ],
    exports: [
    ],

})
export class ItemModule {}
