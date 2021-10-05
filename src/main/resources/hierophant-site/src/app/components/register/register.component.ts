import { Component, OnInit } from '@angular/core';
import { User, Address } from 'src/app/models/user';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  title = "Register User"
  public user = new User('','','','','',[]);
  public address = new Address('','','','');
  
  constructor() { }
  public testUserObj():void{
    this.user.addresses.push(this.address);
    console.log(this.user);

  }
  ngOnInit(): void {
  }

}
