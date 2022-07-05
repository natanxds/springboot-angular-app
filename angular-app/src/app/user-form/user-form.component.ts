import { User } from './../user-table/user';
import { UsersService } from './../users.service';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {

  constructor(
    private service: UsersService) {

   }

  ngOnInit(): void {
  }



postUserData(data: User){
  this.service.create(data).subscribe(
    {
     complete: () => this.onSuccess(),
     error: (e) => this.onError(e),
    }
   )  }



  private onSuccess() {
    alert('User created!');

  }

  private onError(e: any) {
    console.log(e)
    alert('Error, user not created')
  }

}
