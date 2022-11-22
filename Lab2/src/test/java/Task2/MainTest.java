package Task2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    static Admin admin;


    @BeforeAll
    static void init(){

        admin = new Admin("Admin");

        admin.AddProducts("Apple", "Fruit","Solid", 10);



    }


    @Test
    void main() {

        assertEquals(1, admin.productItems.size());

        assertEquals("Apple", admin.productItems.get(0).Name);
        assertEquals("Fruit", admin.productItems.get(0).Group);
        assertEquals(1, admin.productItems.get(0).Id);
        assertEquals(10, admin.productItems.get(0).Price);


    }
}