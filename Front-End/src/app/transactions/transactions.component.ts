import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CardDetailsService } from '../card-details.service';
import { CustomerDetails } from '../customer-details';
import { CustomerDetailsService } from '../customer-details.service';
import { OrderDetails } from '../order-details';
import { OrderDetailsService } from '../order-details.service';
import { ProductListComponent } from '../product-list/product-list.component';

@Component({
  selector: 'app-transactions',
  templateUrl: './transactions.component.html',
  styleUrls: ['./transactions.component.css']
})
export class TransactionsComponent implements OnInit {

  
  date !: Date;
  productDetails = ProductListComponent.staticProduct;

  customer !: CustomerDetails;

  order =new  OrderDetails();

  selectedItem!: number;

  constructor(private service : CustomerDetailsService, private service2 : OrderDetailsService, private service3 : CardDetailsService, private router:Router) { }

  ngOnInit(): void {
   // console.log(this.productDetails);
   let x = sessionStorage.getItem("verifiedUser")
   this.customer = JSON.parse(sessionStorage.getItem('verifiedUser')+'')
  }

  checkValidity(){
    this.date= new Date();
    if(this.customer.carddetails.cardvalidity>=this.date){
      return true;
    }else{
      return false;
    }
  }

  checkStatus(){
    if(this.customer.carddetails.cardstatus==true){
      return true;
    }else{
      return false;
    }
  }

  checkBalence(){
    if(this.customer.carddetails.creditbalance>this.productDetails.productcost){
      return true;
    }else{
      return false;
    }
  }

  onOrderConfirmed(){
    if(this.checkBalence()&&this.checkStatus()){
   let e = (document.getElementById("dropdown")) as HTMLSelectElement;
    let f = e.options[e.selectedIndex].value;
    console.log(f);
    this.order.emiduration=parseInt(f);
    this.order.paidamount=this.productDetails.productcost;
    console.log(this.order.paidamount);
    console.log(this.productDetails.productcost);
    console.log(this.order);
    let x =new OrderDetails();
    x.emiduration=this.order.emiduration;
    x.orderdate=this.order.orderdate;
    x.orderdate = new Date("yyyy-mm-dd");
    x.paidamount=this.order.paidamount;
    x.productname=this.productDetails.productname;
    this.customer.customerorderlist=this.customer.customerorderlist;
    console.log(this.customer.customerorderlist);
    this.customer.customerorderlist.push(x);
    console.log(this.customer.customerorderlist);
    
    this.service2.postOrder(this.customer);
    this.service3.setBalance(this.customer.carddetails.cardid, this.productDetails.productcost);
    this.service.afterTransaction(this.customer.customerid)
    alert("Ordered Conformed\nChanges in the dash board and recent transaction will be reflected after sometime");
    this.router.navigateByUrl('/dashboard')
    }
    else{
      alert("Ether the card is invalid or your balance is too low to purchase this product")
    }
    }

}
