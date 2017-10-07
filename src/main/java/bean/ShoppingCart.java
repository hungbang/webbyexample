package bean;

import entity.Product;

import javax.ejb.Local;

/**
 * Created by KAI on 10/7/17.
 */
@Local
public interface ShoppingCart {
    void addProductToCart(Product name);
    void checkOut();
}
