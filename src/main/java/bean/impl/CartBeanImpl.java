package bean.impl;

import bean.CartBean;
import entity.Product;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by KAI on 10/7/17.
 */
@Stateless
public class CartBeanImpl implements CartBean {

    List<Product> products;

    @PostConstruct
    private void initBean(){
        products = new ArrayList<>();
    }

    @Override
    public void addProductToCart(Product p) {
        products.add(p);
    }

    @Override
    public void checkOut() {
        for (Product p: products){
            System.out.println(p.toString());
        }
    }
}
