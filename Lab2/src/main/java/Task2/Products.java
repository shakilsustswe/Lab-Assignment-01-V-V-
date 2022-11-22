package Task2;

public class Products {

    static int productCount = 1;
    public int Id;
    public int Price;
    public String Name;
    public String Group;
    public String SubGroup;


    public Products(String name, String group,String subGroup, int price) {
        Id = productCount;
        Name = name;
        Group = group;
        SubGroup=subGroup;
        Price = price;
        productCount++;
    }

   public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setGroup(String group) {
        Group = group;
    }

    public void setSubGroup(String subGroup) {
        SubGroup = subGroup;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
