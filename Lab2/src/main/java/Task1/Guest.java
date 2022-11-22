//Guest add to customer


package Task1;

import java.util.ArrayList;

public class Guest {

    public ArrayList<Products> ViewProducts(Admin admin){

        return admin.ViewProducts();

    }

    public Customer GetRegistered(String name){
        Customer customer = new Customer(name);
        System.out.println("Customer Registered as " + customer.Name);
        return customer;
    }



}
