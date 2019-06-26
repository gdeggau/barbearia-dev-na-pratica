import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Item } from 'src/app/core/entities/item/item';
import { ItemService } from 'src/app/core/entities/item/item.service';


@Injectable()
export class ItemResolver implements Resolve<Item []> {

    constructor(private service: ItemService) { }

    resolve(
        route: ActivatedRouteSnapshot,
        state: RouterStateSnapshot
    ): Observable<any> | Promise<any> | any {
        return this.service.get(route.paramMap.get('id'));
    }
}
