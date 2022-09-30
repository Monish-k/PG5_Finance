import { Component, OnInit } from '@angular/core';
import { CustomerDetailsService } from '../customer-details.service';
import { FormBuilder, FormGroup, FormControl, Validators, FormArray } from '@angular/forms';
import { CustomerDetails } from '../customer-details';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;
  user=new CustomerDetails();

  constructor(private service:CustomerDetailsService, private route:Router) { 
    this.loginForm = new FormGroup({
      username: new FormControl('', [Validators.required]),
      password: new FormControl('', [Validators.required])
    });
  }
  public removeSessionStorageData(){
    sessionStorage.removeItem('verifiedUser')
  }

  LoginUser(){
    console.log("function returned");
    this.user=this.service.validatedUser(this.loginForm.value['username'],this.loginForm.value['password']);
    console.log(this.user.customerid);
    console.log(this.user['bankname']);
    console.log(this.user.customerid);
    //console.log(sessionStorage.getItem("verifiedUser"))
    if(sessionStorage.getItem("verifiedUser")!=null){
      this.route.navigateByUrl('/dashboard')
    }
  }

  ngOnInit(): void {
    sessionStorage.clear()
  }


}
