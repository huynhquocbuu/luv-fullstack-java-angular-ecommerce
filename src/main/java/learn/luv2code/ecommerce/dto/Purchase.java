package learn.luv2code.ecommerce.dto;

import learn.luv2code.ecommerce.entity.Address;
import learn.luv2code.ecommerce.entity.Customer;
import learn.luv2code.ecommerce.entity.Order;
import learn.luv2code.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
