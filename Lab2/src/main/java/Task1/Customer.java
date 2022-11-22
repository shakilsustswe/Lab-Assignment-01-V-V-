
//add to cart
//delete to cart
package Task1;

import java.util.ArrayList;

public class Customer {

    static int customerCount = 1;
    public int CustomerId;
    public String Name;

    public Cart cart;
    public Payment payment;

    public Customer(String name) {
        CustomerId = customerCount;
        Name = name;
        customerCount++;
        cart = new Cart();
        payment = new Payment();
    }



    public ArrayList<Products> ViewCartProducts(){

        return cart.ViewCart();
    }

    public void AddToCart(Products product){

        cart.AddToCart(product);

    }

    public void DeleteFromCart(int id){
        cart.DeleteFromCart(id);
    }

    public void Cus_id(){
        System.out.println("Customer Id :"+CustomerId);
    }

}
