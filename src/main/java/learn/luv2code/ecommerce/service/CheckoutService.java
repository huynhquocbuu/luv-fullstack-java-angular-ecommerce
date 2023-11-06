package learn.luv2code.ecommerce.service;

import learn.luv2code.ecommerce.dto.Purchase;
import learn.luv2code.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
