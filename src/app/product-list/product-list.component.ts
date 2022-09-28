import { Component, OnInit } from '@angular/core';
import { ProductDetails } from '../product-details';
import { ProductDetailsService } from '../product-details.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent  implements OnInit {

  productdetails : ProductDetails[];

 public oneProduct : ProductDetails;

 public static  staticProduct :ProductDetails;
 


  constructor(private productservice : ProductDetailsService) { }

  ngOnInit(): void {
    this.getAllproductList();
  }

  
   getAllproductList(){
     this.productservice.getAllProducts().subscribe(
      data=>{
        this.productdetails = data;
      }
    );
    console.log(this.productdetails);
  }

  

  onSelect(product : ProductDetails): void{
    this.oneProduct = product;
    ProductListComponent.staticProduct = this.oneProduct;

  }

}
