package Task2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdminTest {

    static Admin admin1;
    static Admin admin2;
    static Products product1;
    static Products product2;
    static Products product3;


    @BeforeAll
    static void init(){
        admin1 = new Admin("admin1");
        admin2 = new Admin("admin2");

        product1 = new Products("Apple", "Fruit", "Solid",200);


        admin1.AddProducts(product1.Name, product1.Group,product1.SubGroup, product1.Price);

    }

    @Test
    void ProductsItemsSizeIsThree() {
        assertEquals(1, admin1.productItems.size());
    }

    @Test
    void viewProducts() {

        assertEquals(1, admin1.productItems.size());
        assertEquals("Apple", admin1.productItems.get(0).Name);
        assertEquals(2, admin1.productItems.get(0).Id);
    }

    @Test
    void addProducts() {
        admin2.AddProducts(product1.Name, product1.Group,product1.SubGroup, product1.Price);
        assertEquals(1, admin2.productItems.size());
    }

    @Test
    void deleteProducts() {
        admin1.DeleteProducts(0);
        assertEquals(0, admin1.productItems.size());

    }

    @Test
    void modifyProducts() {
        admin2.AddProducts(product1.Name, product1.Group,product1.SubGroup, product1.Price);



        admin1.ModifyProducts(0,"Peanut", "Nut", "Something",30);
        assertEquals("Peanut", admin1.productItems.get(0).Name);
        assertEquals("Nut", admin1.productItems.get(0).Group);
    }
}