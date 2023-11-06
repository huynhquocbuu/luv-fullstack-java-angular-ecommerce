import {Address} from "./address";
import {Order} from "./order";
import {OrderItem} from "./order-item";
import {Customer} from "./customer";

//Customer
export class Purchase {
  customer!: Customer;
  shippingAddress!: Address;
  billingAddress!: Address;
  order!: Order;
  orderItems!: OrderItem[];
}
