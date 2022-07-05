import { UsersService } from './../users.service';
import { Component, OnInit } from '@angular/core';
import { User } from './user';

@Component({
  selector: 'app-user-table',
  templateUrl: './user-table.component.html',
  styleUrls: ['./user-table.component.css']
})
export class UserTableComponent implements OnInit {

  users: User[] = [];
  constructor(private service: UsersService) { }

  ngOnInit(): void {
    this.service.list().subscribe(user => this.users = user);
  }

}
