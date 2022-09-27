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

  customerDetails : CustomerDetails[];

  cardDetails: CardDetails= new  CardDetails();
  


  constructor(private service:CustomerDetailsService, private service2 : CardDetailsService) { }

  ngOnInit(): void {
    this.getCustomerDetailsById(1);
    this.getCardDetailsById(10000);
  }

  getCustomerDetailsById(id : number){
    this.service.getCustomerById(1);
    console.log("working");
  }

  getCardDetailsById(id:number){
    this.service2.getCardDetailsById(10000).subscribe(data=>{
      console.log("anything")
     // console.log(data.map);
      //this.cardDetails = data[0];
    })
    console.log(this.cardDetails);
  }

  cardStatus(){
  }
}
