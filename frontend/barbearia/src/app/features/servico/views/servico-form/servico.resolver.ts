import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Servico } from 'src/app/core/entities/servico/servico';
import { ServicoService } from 'src/app/core/entities/servico/servico.service';


@Injectable()
export class ServicoResolver implements Resolve<Servico []> {

    constructor(private service: ServicoService) { }

    resolve(
        route: ActivatedRouteSnapshot,
        state: RouterStateSnapshot
    ): Observable<any> | Promise<any> | any {
        return this.service.get(route.paramMap.get('id'));
    }
}
