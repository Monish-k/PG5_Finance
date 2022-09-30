import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CardDetails } from '../card-details';
import { CardDetailsService } from '../card-details.service';
import { CustomerDetails } from '../customer-details';
import { CustomerDetailsService } from '../customer-details.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  cardDetails !: CardDetails;

  customerDetails = new CustomerDetails();

  statusRecieved : any;

  constructor(private service : CardDetailsService, private customerService : CustomerDetailsService, private router:Router) { }

  ngOnInit(): void {
    document.getElementById("notWorking")?.addEventListener("click",this.LogOutNow);
    this.customerDetails = JSON.parse(sessionStorage.getItem("verifiedUser")+"")
    this.cardDetails = JSON.parse(sessionStorage.getItem('verifiedCard')+'')
    if(this.cardDetails.cardstatus){
      this.statusRecieved = "Activated";
   }else{
    this.statusRecieved = "Deactivated";
   }
  }


  getCardById(id:number){
      this.service.getCardDetailsById(id).subscribe(data=>{
        sessionStorage.setItem("statusRecieved",data.cardstatus.toString())
      this.cardDetails = data;
      console.log(this.cardDetails);
     })
     
     };

     cardStatus(){
      return 1;
    }

    public LogOutNow(){
      this.router.navigateByUrl("login")
      sessionStorage.clear();
      
    }

}
