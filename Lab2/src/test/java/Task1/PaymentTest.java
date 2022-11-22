package Task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaymentTest {



    @Test
    void makePayment() {
        Customer customer1 = new Customer("John");
        Products product1 = new Products("Apple", "Fruit", "Solid",200);
        Products product2 = new Products("Orange", "Fruit", "Liquid",150);

        customer1.AddToCart(product1);
        customer1.AddToCart(product2);

        assertEquals(350, customer1.payment.MakePayment(customer1.cart.SumTotalPrice()));
    }
}