import { CardDetails } from "./card-details";
import { OrderDetails } from "./order-details";

export class CustomerDetails {
	customerid !: number;
	customername !: string;
	customeremail !: string;
	customerpassword !: string;
	customeraddress !: string;
	cardtype !: string;
	bankname !: string;
	ifsccode !: string;
	customerdob !: Date;
	customeraccno !: number;
	carddetails !: CardDetails;
	customerorderlist !: OrderDetails[];
	 constructor(){
	 }

}
