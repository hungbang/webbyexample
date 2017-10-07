package servlet;

import bean.CartBean;
import bean.ShoppingCart;
import entity.Product;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by KAI on 10/7/17.
 */
public class CartServlet extends HttpServlet {


    private String beanName="java:global/CartBeanImpl!bean.CartBean";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hello, I'm Servlet.");
        CartBean cart = (CartBean)req.getSession().getAttribute("shoppingCart");

        if(cart == null){
            cart = getBean(beanName);
            req.getSession().setAttribute("shoppingCart", cart);
            System.out.println("Shopping cart created");
        }

        String productName = req.getParameter("name");
        System.out.println("product name is : "+ productName);
        if(productName != null && productName.length() > 0){
            Product product = new Product(productName);
            cart.addProductToCart(product);
        }

        String checkout = req.getParameter("checkout");

        if(checkout != null && checkout.equalsIgnoreCase("yes")){
            cart.checkOut();
            System.out.println("Cart checked out");
        }
    }

    private CartBean getBean(String shoppingCart) throws ServletException {
        try {
            InitialContext initialContext = new InitialContext();
            return (CartBean)initialContext.lookup(shoppingCart);
        } catch (NamingException e) {
            System.out.println("Bean Name doesn't exists.");
            throw new ServletException(e.getMessage());
        }
    }
}
