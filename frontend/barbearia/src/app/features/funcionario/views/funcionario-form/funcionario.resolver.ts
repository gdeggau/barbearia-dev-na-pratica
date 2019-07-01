import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Funcionario } from 'src/app/core/entities/funcionario/funcionario';
import { FuncionarioService } from 'src/app/core/entities/funcionario/funcionario.service';


@Injectable()
export class FuncionarioResolver implements Resolve<Funcionario []> {

    constructor(private service: FuncionarioService) { }

    resolve(
        route: ActivatedRouteSnapshot,
        state: RouterStateSnapshot
    ): Observable<any> | Promise<any> | any {
        return this.service.get(route.paramMap.get('id'));
    }
}
