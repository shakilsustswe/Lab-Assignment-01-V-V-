package Task2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GuestTest {
    static Admin admin;
    static Guest guest;


    @BeforeAll
    static void init(){
        admin = new Admin("Admin");
        guest = new Guest();

        admin.AddProducts("Apple", "Fruit", "Solid",10);


    }

    @Test
    void viewProducts() {

        assertEquals(1, guest.ViewProducts(admin).size());
        assertEquals("Apple", guest.ViewProducts(admin).get(0).Name);
    }

    @Test
    void getRegistered() {
        guest.GetRegistered("Guest1");
        assertEquals("Guest1", guest.GetRegistered("Guest1").Name);
    }
}