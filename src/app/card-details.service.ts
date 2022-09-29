import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';

import { CustomerDetails } from './customer-details';
import { Observable } from 'rxjs';
import { CardDetails } from './card-details';

@Injectable({
  providedIn: 'root'
})
export class CardDetailsService {


  setBalance(customerId: number, productCost: number) {
    this.http.get(this.url+"/setBalance/"+customerId+"/"+productCost).subscribe(data=>{

    },error=>{
      console.log(error);
    });
  }

  setStatus(id:number) {
    return this.http.put(this.url+"/setStatus/",id);
  }

  private url="http://localhost:8088";

  constructor(private http:HttpClient) { }


  getCardDetailsById(id:number){
    console.log("function called")
    return this.http.get<CardDetails>(this.url+"/getCard/"+id);
  }

    
}
