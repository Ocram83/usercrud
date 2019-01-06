import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../model/user';


@Injectable({
  providedIn: 'root'
})
export class UserService {

  public API = '//localhost:8080/api/user';

  constructor(private http: HttpClient) { }

  getAll(): Observable<any> {
    return this.http.get('//localhost:8080/api/user');
  }

  get(id: string) {
    return this.http.get(this.API + '/' + id);
  }

  save(user: User): Observable<any> {
    let result: Observable<Object>;

    console.log("id is :"+user.id);
    console.log("name is :"+user.name);

    if (user['id']) {
      result = this.http.put(this.API+"/"+user.id, user);
    } else {
      result = this.http.post(this.API, user);
    }
    return result;
  }

  remove(id: string) {
    return this.http.delete(this.API+"/"+id);
  }
}
