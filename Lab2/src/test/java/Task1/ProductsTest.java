package Task1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductsTest {

    static Products product1;
    static Products product2;

    @BeforeAll
    static void init(){
        product1 = new Products("Apple", "Fruit","Solid" ,200);
    }


    @Test
    void setId() {
        product1.setId(1);
        assertEquals(1, product1.Id);
    }

    @Test
    void setName() {
        product1.setName("Tomato");
        assertEquals("Tomato", product1.Name);
    }

    @Test
    void setGroup() {
        product1.setGroup("Vegetable");
        assertEquals("Vegetable", product1.Group);
    }

    @Test
    void setPrice() {
        product1.setPrice(50);
        assertEquals(50, product1.Price);
    }
}