

package Task1;

public class Main {
    public static void main(String[] args) {

//create product
        Products product1 = new Products("Apple", "Fruit","Solid" ,200);
        Products product2 = new Products("Orange", "Fruit", "Liquid",150);
        Products product3 = new Products("Banana", "Fruit","Solid" ,10);

        Admin admin1 = new Admin("Shakil");
        Admin admin2 = new Admin("Salman");


//add product to admin
        admin1.AddProducts(product1.Name, product1.Group,product1.SubGroup, product1.Price);
        admin1.AddProducts(product2.Name, product2.Group,product2.SubGroup, product2.Price);
        admin2.AddProducts(product3.Name, product3.Group, product3.SubGroup,product3.Price);


        System.out.println(".............Admin1 Products.........");

        admin1.ViewProducts();


        //create customer
        Customer customer1 = new Customer("Nahid");
        customer1.Cus_id();
       //Customer adds products in cart
        customer1.AddToCart(product1);
        customer1.AddToCart(product2);
        customer1.cart.cart_Size();

        System.out.println(".........Cart Products..........");

        customer1.ViewCartProducts();

        System.out.println("Total Price: " + customer1.cart.SumTotalPrice());


        System.out.println(".........Payment..........");


        //total cart price
        customer1.payment.MakePayment(customer1.cart.SumTotalPrice());


        System.out.println(".........Guest view Products..........");
        //create Guest
        Guest guest1 = new Guest();
        guest1.ViewProducts(admin1);
        guest1.GetRegistered("Guest1");


    }
}