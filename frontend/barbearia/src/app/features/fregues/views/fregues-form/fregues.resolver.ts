import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Fregues } from 'src/app/core/entities/fregues/fregues';
import { FreguesService } from 'src/app/core/entities/fregues/fregues.service';


@Injectable()
export class FreguesResolver implements Resolve<Fregues []> {

    constructor(private service: FreguesService) { }

    resolve(
        route: ActivatedRouteSnapshot,
        state: RouterStateSnapshot
    ): Observable<any> | Promise<any> | any {
        return this.service.get(route.paramMap.get('id'));
    }
}
