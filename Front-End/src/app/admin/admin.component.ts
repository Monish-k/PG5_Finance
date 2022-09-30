import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AdminLoginComponent } from '../admin-login/admin-login.component';
import { CardDetailsService } from '../card-details.service';
import { CustomerDetails } from '../customer-details';
import { CustomerDetailsService } from '../customer-details.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
  public isClicked =false;

  customerDetails = new Array<CustomerDetails>();

  oneCustomer !: CustomerDetails;

  constructor(private customerService: CustomerDetailsService, private cardService : CardDetailsService, private router:Router) { }

  ngOnInit(): void {
    this.getAllCustomer();
    this.customerDetails=AdminLoginComponent.allcustomer;
  }

  private getAllCustomer(){
    this.customerService.getAllCustomer();
  }

  public onApproved(customer : CustomerDetails){
    let x:boolean;
    //this.customerDetails = JSON.parse(sessionStorage.getItem('allCustomers')+"")
    this.oneCustomer = customer;
    //console.log(this.oneCustomer.carddetails.cardstatus);
    this.cardService.setStatus(this.oneCustomer.carddetails.cardid);
     this.cardService.getCardDetailsById(this.oneCustomer.carddetails.cardid).subscribe(data=>{
      x = data.cardstatus;
      
      //console.log(x);
    });
    alert("Card Status Updated");
  }

  public logout(){
    sessionStorage.clear();
    this.router.navigateByUrl('/login')
  }

  public getStatus(){
    if(this.oneCustomer.carddetails.cardstatus==true){
      return true;
    }else{
      return false;
    }
  }

}
