import { Component, OnInit } from '@angular/core';
import { CardDetails } from '../card-details';
import { CardDetailsService } from '../card-details.service';
import { CustomerDetails } from '../customer-details';
import { CustomerDetailsService } from '../customer-details.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  cardDetails : CardDetails[];

  card : CardDetails;

  customerDetails = new CustomerDetails();

  statusRecieved : any;

  constructor(private service : CardDetailsService, private customerService : CustomerDetailsService) { }

  ngOnInit(): void {
    this.getCardById(10000);
    this.getCustomerById(1);
    if(this.card.cardStatus){
      this.statusRecieved = "Activated";
   }else{
    this.statusRecieved = "Deactivated";
   }
  }


  getCardById(id:number){
      this.service.getCardDetailsById(id).subscribe(data=>{
        sessionStorage.setItem("statusRecieved",data.cardStatus.toString())
      this.card = data;
      console.log(this.card);
     })
     
     };


  getCustomerById(id:number){
    return this.customerService.getCustomerById(id).subscribe(data=>{
      this.customerDetails=data;
      console.log(this.customerDetails);
    })
  }

     cardStatus(){
      return 1;
    }
  
  }

