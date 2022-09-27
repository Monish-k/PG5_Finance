import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { CustomerDetails } from './customer-details';
import { Observable } from 'rxjs';
import { CardDetails } from './card-details';

@Injectable({
  providedIn: 'root'
})
export class CardDetailsService {

  private url="http://localhost:8088";

  constructor(private http:HttpClient) { }


  getCardDetailsById(id:number):Observable<CardDetails[]>{
    console.log("function called")
    return this.http.get<CardDetails[]>(this.url+"/getCard/"+id);
  }
  
}
