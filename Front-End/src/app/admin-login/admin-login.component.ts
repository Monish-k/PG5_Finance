import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormControl, Validators, FormArray } from '@angular/forms';
import { CustomerDetails } from '../customer-details';
import { Router } from '@angular/router';
import { CustomerDetailsService } from '../customer-details.service';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {
  loginAdminForm: FormGroup;
  static allcustomer: CustomerDetails[];

  constructor(private service:CustomerDetailsService, private route:Router) {
    this.loginAdminForm = new FormGroup({
      username: new FormControl('', [Validators.required]),
      password: new FormControl('', [Validators.required])
    });
   }

   public removeSessionStorageData(){
    sessionStorage.removeItem('verifiedUser')
  }

  LoginAdmin(){
    this.service.validateAdmin(this.loginAdminForm.value['username'],this.loginAdminForm.value['password']);
    let check = sessionStorage.getItem("adminAccess")
    console.log("outside function")
    console.log(typeof(check),typeof(check?.toString()));
    if(check){
      this.route.navigateByUrl('/admin')
    }
    else{
      alert("Incorrect Credentials")
    }
  }

  ngOnInit(): void {
  }

}
