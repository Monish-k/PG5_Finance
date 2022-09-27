import { Component, OnInit } from '@angular/core';
import { OrderDetails } from '../order-details';
import { ProductDetails } from '../product-details';

@Component({
  selector: 'app-transactions',
  templateUrl: './transactions.component.html',
  styleUrls: ['./transactions.component.css']
})
export class TransactionsComponent implements OnInit {


  productDetails : ProductDetails[];

  orderDetails : OrderDetails[];

  constructor() { }

  ngOnInit(): void {
  }

  onOrderConfirmed(){
    
  }


}
