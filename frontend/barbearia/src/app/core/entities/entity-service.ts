import { HttpClient, HttpHeaders } from '@angular/common/http';
import { catchError } from 'rxjs/operators/';
import { throwError } from 'rxjs';

export class EntityService<T> {
  public headers: HttpHeaders;

  constructor(
    protected http: HttpClient,
    protected entityUrl: string,
  ) {
    this.http = http;
    this.entityUrl = entityUrl;
    this.headers = new HttpHeaders().set('Authorization', 'Bearer 63b7c2003e0d44c5a5b5a815e559ef88');
  }

  public list() {
    return this.http.get<T[]>(this.entityUrl, { headers: this.headers }).pipe(this.defaultCatch());
  }

  public get(id: any) {
    return this.http.get<T[]>(`${this.entityUrl}/${id}`, { headers: this.headers }).pipe(this.defaultCatch());
  }

  public insert(entity: T) {
    return this.http.post<T[]>(this.entityUrl, entity, { headers: this.headers }).pipe(this.defaultCatch());
  }

  public update(id: any, entity: T) {
    return this.http.put<T[]>(`${this.entityUrl}/${id}`, entity, { headers: this.headers }).pipe(this.defaultCatch());
  }

  public delete(id: any) {
    return this.http.delete<T[]>(`${this.entityUrl}/${id}`, { headers: this.headers }).pipe(this.defaultCatch());
  }

  public defaultCatch() {
    return catchError((err: any) => {
      if (err) {
        const summary =  err.status ? String(err.status) : 'Error';
        const detail = (err.error && err.error.message) || err.statusText || err.message || 'Error';
        console.log(summary, detail);
      }
      return throwError(err);
    });
  }
}

