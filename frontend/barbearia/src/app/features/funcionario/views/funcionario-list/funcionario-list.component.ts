import { Component, OnInit } from '@angular/core';
import { FuncionarioService } from 'src/app/core/entities/funcionario/funcionario.service';
import { MessageService } from 'primeng/components/common/messageservice';
import { Funcionario } from 'src/app/core/entities/funcionario/funcionario';
import { ActivatedRoute, Router } from '@angular/router';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';

@Component({
  selector: 'app-funcionario-list',
  templateUrl: './funcionario-list.component.html'
})
export class FuncionarioListComponent implements OnInit {

  funcionarios: Funcionario[];
  columns: any[];

  constructor(
    private funcionarioService: FuncionarioService,
    private messageService: MessageService,
    private router: Router,
    private route: ActivatedRoute
    ) { }

  ngOnInit() {
    this.funcionarioService.list()
    .pipe(this.listErrorCatch())
    .subscribe(({ contents }) => {
      this.funcionarios = contents;
    });

    this.columns = this.getGridColumns();

  }

  private getGridColumns() {
    const gridcloumns = [
      { field: 'nome', header: 'Nome' },
      { field: 'dataNascimento', header: 'Data de Nascimento' },
      { field: 'email', header: 'E-mail' },
      { field: 'cpf', header: 'CPF' },
      { field: 'endereco', header: 'Endereço' },
      { field: 'nomeUsuario', header: 'Nome do usuário' },
      { field: 'salario', header: 'Salário' }
    ];

    return gridcloumns;
  }

  public onRemove(item: Funcionario) {
    this.messageService.add({
      key: 'removeConfirm',
      data: item, sticky: true,
      severity: 'info',
      summary: 'Voce tem certeza?',
      detail: 'Confirme para DELETAR'
    });
  }

  public onAdd() {
    this.router.navigate(['/funcionario/create'], { relativeTo: this.route });
  }

  public editItem(funcionario: Funcionario) {
    this.router.navigate([`/funcionario/edit/${funcionario.id}`], { relativeTo: this.route });
  }

  public onRemoveConfirm(item: any) {
    const { id, nome } = item.data;

    this.funcionarioService.delete(id).subscribe(() => {
      this.messageService.clear('removeConfirm');
      this.funcionarios = this.funcionarios.filter(funcionario => funcionario.id !== id);
      this.funcionarios.find((funcionario: Funcionario) => funcionario.id === id);
      this.messageService.add({
        key: 'remove-toast',
        severity: 'success',
        summary: `Sucesso!`,
        detail: `Funcionário ${nome} deletado!`
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
