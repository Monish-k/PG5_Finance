import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ProductDetails } from './product-details';

@Injectable({
  providedIn: 'root'
})
export class ProductDetailsService {

  private url = "http://localhost:8088"
  constructor(private http : HttpClient ) { }

  getAllProducts(){
    console.log("Function called")
    return this.http.get<ProductDetails[]>(this.url+"/getAllProduct");
  }

}
