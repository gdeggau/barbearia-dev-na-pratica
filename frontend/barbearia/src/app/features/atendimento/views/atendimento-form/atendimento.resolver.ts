import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Atendimento } from 'src/app/core/entities/atendimento/atendimento';
import { AtendimentoService } from 'src/app/core/entities/atendimento/atendimento.service';


@Injectable()
export class AtendimentoResolver implements Resolve<Atendimento []> {

    constructor(private service: AtendimentoService) { }

    resolve(
        route: ActivatedRouteSnapshot,
        state: RouterStateSnapshot
    ): Observable<any> | Promise<any> | any {
        return this.service.get(route.paramMap.get('id'));
    }
}
