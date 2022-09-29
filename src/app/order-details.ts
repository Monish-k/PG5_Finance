import { ProductDetails } from "./product-details";
export class OrderDetails {
    orderid !: number;
	orderdate !: Date;
	productordered !: ProductDetails;
	paidamount !: number;
	emiduration !: number;
	productname!:String;
}
