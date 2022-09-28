import { CardDetails } from "./card-details"
import { OrderDetails } from "./order-details"

export class CustomerDetails {
    customerId : number
    customerName : string
    customerEmail : string
    customerPassword : string
    customerAddress : string
    cardType : string
    bankName : string
    customerAccNo : number
    customerDob : Date
    ifscCode : string
    cardDetails : CardDetails
    customerOrderList : OrderDetails[]


    constructor(){
        
    }
}
