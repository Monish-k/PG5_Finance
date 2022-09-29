import { Component, OnInit } from '@angular/core';
import { CustomerDetails } from '../customer-details';
import { CustomerDetailsService } from '../customer-details.service';
import { OrderDetails } from '../order-details';
import { OrderDetailsService } from '../order-details.service';

@Component({
  selector: 'app-recent-transactions',
  templateUrl: './recent-transactions.component.html',
  styleUrls: ['./recent-transactions.component.css']
})
export class RecentTransactionsComponent implements OnInit {

  constructor(private service: CustomerDetailsService, private service2 : OrderDetailsService) { }

  ngOnInit(): void {
    this.getCustomerById(1);
  }


  customer !: CustomerDetails;

  listOfOrder!: OrderDetails[];



  getCustomerById(id:number){
    this.customer = JSON.parse(""+sessionStorage.getItem("verifiedUser"))
      console.log(this.customer);
      this.listOfOrder = this.customer.customerorderlist;
    }
}