import { Component, OnInit } from '@angular/core';
import { ClienteService } from 'src/app/core/entities/cliente/cliente.service';
import { MessageService } from 'primeng/components/common/messageservice';
import { ActivatedRoute, Router } from '@angular/router';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';
import { Item } from 'src/app/core/entities/item/item';
import { ItemService } from 'src/app/core/entities/item/item.service';

@Component({
  selector: 'app-cliente-list',
  templateUrl: './item-list.component.html',
})
export class ItemListComponent implements OnInit {

  items: Item[];
  columns: any[];

  constructor(
    private itemService: ItemService,
    private messageService: MessageService,
    private router: Router,
    private route: ActivatedRoute
    ) { }

  ngOnInit() {
    this.itemService.list()
    .pipe(this.listErrorCatch())
    .subscribe(({ contents }) => {
      this.items = contents;
    });

    this.columns = this.getGridColumns();

  }

  private getGridColumns() {
    const gridcloumns = [
      { field: 'descricao', header: 'Descricao' },
      { field: 'quantidade', header: 'Quantidade' },
      { field: 'valorUnitario', header: 'Valor Unitario' },
      { field: '', header: 'Acoes' }
    ];

    return gridcloumns;
  }

  public onRemove(item: Item) {
    this.messageService.add({
      key: 'removeConfirm',
      data: item, sticky: true,
      severity: 'info',
      summary: 'Voce tem certeza?',
      detail: 'Confirme para DELETAR'
    });
  }

  public onAdd() {
    this.router.navigate(['/item/create'], { relativeTo: this.route });
  }

  public editItem(item: Item) {
    this.router.navigate([`/item/edit/${item.id}`], { relativeTo: this.route });
  }

  public onRemoveConfirm(item: any) {
    const { id, descricao } = item.data;

    this.itemService.delete(id)
    .pipe(this.listErrorCatch(`Error`, `Erro ao deletar o item`))
    .subscribe(() => {
      this.messageService.clear('removeConfirm');
      this.items = this.items.filter(item => item.id !== id);
      this.items.find((item: Item) => item.id === id);
      this.messageService.add({
        key: 'remove-toast',
        severity: 'success',
        summary: `Sucesso!`,
        detail: `Item ${descricao} deletado!`
      });
    });
  }

  public onRemoveReject() {
    this.messageService.clear('removeConfirm');
  }

  private listErrorCatch(summary?: string, detail?: string) {
      return catchError((err: any) => {
        if (err) {
          this.messageService.add({
            key: 'remove-toast',
            severity: 'error',
            summary: summary || `Error!`,
            detail: detail || `Default error!`
          });
        }
        this.messageService.clear('removeConfirm');
        return throwError(err);
      });
  }

}
