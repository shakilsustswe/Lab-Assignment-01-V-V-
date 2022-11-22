package Task1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class CartTest {
    static Cart cart;
    static Cart cart2;
    static Products product1;
    static Products product2;
    static Products product3;

    @BeforeAll
    static void init(){
        cart = new Cart();
        product1 = new Products("Apple", "Fruit","Solid", 200);
        product2 = new Products("Orange", "Fruit", "Liquid",150);
        product3 = new Products("Banana", "Fruit", "Solid",10);

        cart.AddToCart(product1);
        cart.AddToCart(product2);
        cart.AddToCart(product3);
    }

    @Test
    void addToCart() {

        assertEquals(3, cart.cartItems.size());
        assertEquals("Apple", cart.cartItems.get(0).Name);
        assertEquals("Fruit", cart.cartItems.get(0).Group);
        assertEquals(200, cart.cartItems.get(0).Price);
    }

    @Test
    void deleteFromCard() {

        assertEquals(3, cart.cartItems.size());

        cart.DeleteFromCart(1);
        assertEquals(2, cart.cartItems.size());
        assertEquals("Apple", cart.cartItems.get(0).Name);
        assertEquals("Fruit", cart.cartItems.get(0).Group);
        assertEquals(200, cart.cartItems.get(0).Price);
    }

    @Test
    void viewCart() {
        cart2 = new Cart();
        cart2.AddToCart(product1);
        cart2.AddToCart(product2);
        cart2.AddToCart(product3);


        assertEquals(3, cart2.cartItems.size());


        assertEquals("Apple", cart2.cartItems.get(0).Name);
        assertEquals("Fruit", cart2.cartItems.get(0).Group);
        assertEquals(200, cart2.cartItems.get(0).Price);

        assertEquals("Banana", cart2.cartItems.get(2).Name);
        assertEquals("Fruit", cart2.cartItems.get(2).Group);
        assertEquals(10, cart2.cartItems.get(2).Price);

        assertSame(cart2.cartItems, cart2.ViewCart());
    }

    @Test
    void sumTotalPrice() {

        assertEquals(210, cart.SumTotalPrice());
    }

    @Test
    void makePayment() {
        cart2 = new Cart();
        cart2.AddToCart(product1);
        cart2.AddToCart(product2);
        assertEquals(350, cart2.SumTotalPrice());
    }
}