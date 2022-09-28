import { Component, OnInit } from '@angular/core';
import { CardDetailsService } from '../card-details.service';
import { CustomerDetails } from '../customer-details';
import { CustomerDetailsService } from '../customer-details.service';
import { OrderDetails } from '../order-details';
import { OrderDetailsService } from '../order-details.service';
import { ProductDetails } from '../product-details';
import { ProductListComponent } from '../product-list/product-list.component';

@Component({
  selector: 'app-transactions',
  templateUrl: './transactions.component.html',
  styleUrls: ['./transactions.component.css']
})
export class TransactionsComponent implements OnInit {

  date : Date;
  productDetails = ProductListComponent.staticProduct;

  customer : CustomerDetails;

  order =new  OrderDetails();

  selectedItem : number;

  constructor(private service : CustomerDetailsService, private service2 : OrderDetailsService, private service3 : CardDetailsService) { }

  ngOnInit(): void {
   // console.log(this.productDetails);
    this.service.getCustomerById(1).subscribe(data=>{
      this.customer=data;
    })
  }

  checkValidity(){
    this.date= new Date();
    if(this.customer.cardDetails.cardValidity>=this.date){
      return true;
    }else{
      return false;
    }
  }

  checkStatus(){
    if(this.customer.cardDetails.cardStatus==true){
      return true;
    }else{
      return false;
    }
  }

  checkBalence(){
    if(this.customer.cardDetails.cerditBalance>this.productDetails.productCost){
      return true;
    }else{
      return false;
    }
  }

  onOrderConfirmed(){
   let e = (document.getElementById("dropdown")) as HTMLSelectElement;
    let f = e.options[e.selectedIndex].value;
    console.log(f);
   this.order.emiDuration=parseInt(f);
    this.order.paidAmount=this.productDetails.productCost;
    console.log(this.order.paidAmount);
    console.log(this.productDetails.productCost);
    console.log(this.order);
    let x =new OrderDetails();
    x.emiDuration=this.order.emiDuration;
    x.orderDate=this.order.orderDate;
    x.paidAmount=this.order.paidAmount;
    x.productName=this.productDetails.productName;
    this.customer.customerOrderList=new Array<OrderDetails>();
    this.customer.customerOrderList.push(x);
    console.log(this.customer.customerOrderList);
    
    this.service2.postOrder(this.customer);
    this.service3.setBalance(this.customer.cardDetails.cardId, this.productDetails.productCost);
    alert("Ordered Conformed");

    }





}
