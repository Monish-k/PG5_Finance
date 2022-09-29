import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { CustomerDetails } from './customer-details';

@Injectable({
  providedIn: 'root'
})
export class CustomerDetailsService {

  private url ="http://localhost:8088";
  constructor(private http:HttpClient) { }

  getAllCustomer():Observable<CustomerDetails[]>{
    return this.http.get<CustomerDetails[]>(this.url+"/getAllUser");
  }

  getCustomerById(id : number):Observable<CustomerDetails>{
    return this.http.get<CustomerDetails>(this.url+"/getUserById/"+id);
  }
}
