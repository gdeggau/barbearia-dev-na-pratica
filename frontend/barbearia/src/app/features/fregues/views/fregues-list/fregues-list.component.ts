import { Component, OnInit } from '@angular/core';
import { FreguesService } from 'src/app/core/entities/fregues/fregues.service';
import { MessageService } from 'primeng/components/common/messageservice';
import { Fregues } from 'src/app/core/entities/fregues/fregues';
import { ActivatedRoute, Router } from '@angular/router';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';

@Component({
  selector: 'app-fregues-list',
  templateUrl: './fregues-list.component.html',
  styleUrls: ['./fregues-list.component.scss']
})
export class FreguesListComponent implements OnInit {

  fregueses: Fregues[];
  columns: any[];

  constructor(
    private freguesService: FreguesService,
    private messageService: MessageService,
    private router: Router,
    private route: ActivatedRoute
    ) { }

  ngOnInit() {
    this.freguesService.list()
    .pipe(this.listErrorCatch())
    .subscribe(({ contents }) => {
      this.fregueses = contents;
    });

    this.columns = this.getGridColumns();

  }

  private getGridColumns() {
    const gridcloumns = [
      { field: 'nome', header: 'Nome' },
      { field: 'dataNascimento', header: 'Data de Nascimento' },
      { field: 'email', header: 'E-mail' },
      { field: 'cpf', header: 'CPF' },
      { field: 'telefone', header: 'Telefone' },
      { field: 'endereco', header: 'Endereço' }
    ];

    return gridcloumns;
  }

  public onRemove(item: Fregues) {
    this.messageService.add({
      key: 'removeConfirm',
      data: item, sticky: true,
      severity: 'info',
      summary: 'Voce tem certeza?',
      detail: 'Confirme para DELETAR'
    });
  }

  public onAdd() {
    this.router.navigate(['/fregues/create'], { relativeTo: this.route });
  }

  public editItem(fregues: Fregues) {
    this.router.navigate([`/fregues/edit/${fregues.id}`], { relativeTo: this.route });
  }

  public onRemoveConfirm(item: any) {
    const { id, nome } = item.data;

    this.freguesService.delete(id).subscribe(() => {
      this.messageService.clear('removeConfirm');
      this.fregueses = this.fregueses.filter(fregues => fregues.id !== id);
      this.fregueses.find((fregues: Fregues) => fregues.id === id);
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
