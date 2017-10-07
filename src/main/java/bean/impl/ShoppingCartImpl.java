package bean.impl;

import bean.ShoppingCart;
import entity.Product;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by KAI on 10/7/17.
 */
@Stateful
public class ShoppingCartImpl implements ShoppingCart {

    private List<Product> products;


    @PostConstruct
    private void initializeBean(){
        products = new ArrayList<Product>();
    }


    public void addProductToCart(Product product) {
        System.out.println("Add product to cart!");
        System.out.println(product.toString());
        products.add(product);
    }

    public void checkOut() {
        System.out.println("Checkout list product");
        for(Product product : products){
            System.out.println(product.toString());
        }
    }
}
