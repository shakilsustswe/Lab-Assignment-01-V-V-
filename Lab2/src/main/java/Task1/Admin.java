

//admin Add Product
//admin Modify Product
//admin Delete Product
//view product

package Task1;
import java.util.ArrayList;

public class Admin{

    static int adminCount = 1;
    public ArrayList<Products> productItems = new ArrayList<Products>();
    private int Id;
    private String Name;



    public Admin(String name) {
        Id = adminCount;
        Name = name;
        adminCount++;
    }

    public ArrayList<Products> ViewProducts(){

        for (Products product : productItems) {
            System.out.println(product.Name);
        }

        return productItems;
    }
    public void AddProducts(String name, String group,String subGroup, int price){
        Products products = new Products(name, group,subGroup, price);
        productItems.add(products);
    }

    public void DeleteProducts(int id){

        productItems.remove(id);
    }

    public void ModifyProducts(int id, String name, String group,String subGroup, int price){
        Products p = productItems.get(id);
        p.setName(name);
        p.setGroup(group);
        p.setSubGroup(subGroup);
        p.setPrice(price);
    }

    //makeShipment
    //ConfirmDelivery
//
//    public addToCart()
//    {
//
//    }
//    public addToCart()
//    {
//
//    }

}
