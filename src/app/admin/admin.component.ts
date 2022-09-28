import { Component, OnInit } from '@angular/core';
import { Route } from '@angular/router';
import { CardDetails } from '../card-details';
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

  customerDetails : CustomerDetails[];

  oneCustomer : CustomerDetails;

  constructor(private customerService: CustomerDetailsService, private cardService : CardDetailsService) { }

  ngOnInit(): void {
    this.getAllCustomer();
  }

  private getAllCustomer(){
    this.customerService.getAllCustomer().subscribe(data=>{
      this.customerDetails=data;
    });
  }

  public onApproved(customer : CustomerDetails){
    let x:boolean;
    this.oneCustomer = customer;
    console.log(this.oneCustomer.cardDetails.cardStatus);
    this.cardService.setStatus(this.oneCustomer.cardDetails.cardId);
     this.cardService.getCardDetailsById(this.oneCustomer.cardDetails.cardId).subscribe(data=>{
      x = data.cardStatus;
      console.log(x);
    });
  }

  public getStatus(){
    return this.oneCustomer.cardDetails.cardStatus;
  }


}
