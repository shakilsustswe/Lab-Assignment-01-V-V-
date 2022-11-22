package Task2;


public class Main {
    public static void main(String[] args) {


        Products product1 = new Products("Apple", "Fruit", "Solid",200);
        Products product2 = new Products("Orange", "Fruit", "Liquid",150);

        Admin admin1 = new Admin("Admin1");

        admin1.AddProducts(product1.Name, product1.Group,product1.SubGroup, product1.Price);
        admin1.AddProducts(product2.Name, product2.Group, product2.SubGroup,product2.Price);


        System.out.println(".............Admin1 Products.........");
        admin1.ViewProducts();
        Customer customer1 = new Customer("Customer1");
        customer1.Cus_id();
        //Customer adds products in cart

        customer1.AddToCart(product1);
        customer1.AddToCart(product2);
        customer1.cart.cart_Size();
        System.out.println(".........Cart Products..........");
        customer1.ViewCartProducts();

        System.out.println();
        System.out.println("Total Price: " + customer1.cart.SumTotalPrice());


        System.out.println(".........Payment..........");



        System.out.println(".........Guest view Products..........");

        Guest guest1 = new Guest();
        guest1.ViewProducts(admin1);
        guest1.GetRegistered("Guest1");


    }
}