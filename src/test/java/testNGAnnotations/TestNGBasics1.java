package testNGAnnotations;

import org.testng.annotations.Test;

public class TestNGBasics1 {


    @Test (priority = 0)
    public void login(){
        System.out.println("login");
    }
    @Test
    public void searchProduct(){
        System.out.println("Search product");
    }
    @Test (dependsOnMethods = ("searchProduct"))
    public void addToCart(){
        System.out.println("add to cart");
    }
    @Test (dependsOnMethods = ("addToCart"))
    public void checkoutCart(){
        System.out.println("checkout cart");
    }
    @Test (priority = 1)
    public void connectToPayment(){
        System.out.println("connect to payment");
    }
}
