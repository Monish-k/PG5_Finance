import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { CustomerDetailsService } from '../customer-details.service';

@Component({
  selector: 'app-forgot-password',
  templateUrl: './forgot-password.component.html',
  styleUrls: ['./forgot-password.component.css']
})
export class ForgotPasswordComponent implements OnInit {
  accountExistForm:FormGroup
  constructor(private service:CustomerDetailsService) { 
    this.accountExistForm = new FormGroup({
      EnterEmail: new FormControl('', [Validators.required, Validators.email])
    });
  }

  check(){
    this.service.validateUserEmail(this.accountExistForm.value["EnterEmail"]);
  }

  ngOnInit(): void {
  }

}
