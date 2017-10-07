package bean;

import entity.Product;

import javax.ejb.Local;

/**
 * Created by KAI on 10/7/17.
 */
@Local
public interface CartBean {

    void addProductToCart(Product p);

    void checkOut();

}
