import { Component, OnInit } from '@angular/core';
import { Route } from '@angular/router';
import { CustomerDetails } from '../customer-details';
import { CustomerDetailsService } from '../customer-details.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  customerDetails : CustomerDetails[];

  constructor(private customerService: CustomerDetailsService) { }

  ngOnInit(): void {
    this.getAllCustomer();
  }

  private getAllCustomer(){
    this.customerService.getAllCustomer().subscribe(data=>{
      this.customerDetails=data;
    });
  }
}
