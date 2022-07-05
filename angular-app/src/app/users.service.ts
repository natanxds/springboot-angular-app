import { User } from './user-table/user';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { take, tap } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class UsersService {

  private readonly API = 'http://localhost:8080/api/v1/users'

  constructor(private http: HttpClient) { }

  list(){
    return this.http.get<User[]>(this.API)
    .pipe(
      tap(console.log)
    );
  }

  create(user: User){
    return this.http.post(this.API, user)
    .pipe(take(1));
  }
}
