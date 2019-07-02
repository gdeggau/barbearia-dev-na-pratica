import { Component, OnInit } from '@angular/core';
import { ServicoService } from 'src/app/core/entities/servico/servico.service';
import { MessageService } from 'primeng/components/common/messageservice';
import { Servico } from 'src/app/core/entities/servico/servico';
import { ActivatedRoute, Router } from '@angular/router';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';

@Component({
  selector: 'app-servico-list',
  templateUrl: './servico-list.component.html'
})
export class ServicoListComponent implements OnInit {

  servicos: Servico[];
  columns: any[];

  constructor(
    private servicoService: ServicoService,
    private messageService: MessageService,
    private router: Router,
    private route: ActivatedRoute
    ) { }

  ngOnInit() {
    this.servicoService.list()
    .pipe(this.listErrorCatch())
    .subscribe(({ contents }) => {
      this.servicos = contents;
    });

    this.columns = this.getGridColumns();

  }

  private getGridColumns() {
    const gridcloumns = [
      { field: 'descricao', header: 'Descrição' },
      { field: 'valor', header: 'Valor' }
    ];

    return gridcloumns;
  }

  public onRemove(item: Servico) {
    this.messageService.add({
      key: 'removeConfirm',
      data: item, sticky: true,
      severity: 'info',
      summary: 'Voce tem certeza?',
      detail: 'Confirme para DELETAR'
    });
  }

  public onAdd() {
    this.router.navigate(['/servico/create'], { relativeTo: this.route });
  }

  public editItem(servico: Servico) {
    this.router.navigate([`/servico/edit/${servico.id}`], { relativeTo: this.route });
  }

  public onRemoveConfirm(item: any) {
    const { id, nome } = item.data;

    this.servicoService.delete(id).subscribe(() => {
      this.messageService.clear('removeConfirm');
      this.servicos = this.servicos.filter(servico => servico.id !== id);
      this.servicos.find((servico: Servico) => servico.id === id);
      this.messageService.add({
        key: 'remove-toast',
        severity: 'success',
        summary: `Sucesso!`,
        detail: `Freguês ${nome} deletado!`
      });
    });
  }

  public onRemoveReject() {
    this.messageService.clear('removeConfirm');
  }

  private listErrorCatch() {
      return catchError((err: any) => {
        if (err) {
          this.messageService.add({
            key: 'remove-toast',
            severity: 'error',
            summary: 'Erro!',
            detail: `Erro ao carregar a lista!`
          });
        }
        return throwError(err);
      });
  }

}
