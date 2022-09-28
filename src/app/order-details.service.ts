import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { CustomerDetails } from './customer-details';
import { OrderDetails } from './order-details';
import { ProductDetails } from './product-details';

@Injectable({
  providedIn: 'root'
})
export class OrderDetailsService {


  postOrder(customerupdated : CustomerDetails) {
    console.log(this.url+"/saveOrder",customerupdated)
    const body = JSON.stringify(customerupdated);
    console.log(body);
    this.http.post(this.url+"/saveOrder",customerupdated).subscribe(
      data=>{

      },error=>{
        console.log(error);
      }
    );
  }

  private url="http://localhost:8088";

  constructor(private http:HttpClient) { }

  
}
