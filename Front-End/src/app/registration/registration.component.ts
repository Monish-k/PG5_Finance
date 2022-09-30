import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { CustomerDetails } from '../customer-details';
import { CustomerDetailsService } from '../customer-details.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  regiUser=new CustomerDetails();


  RegisterUser(){
    console.log(this.regiUser);
    this.service.insertUser(this.regiUser);
  }


  constructor(private service:CustomerDetailsService) { }

  ngOnInit(): void {
  }

}
