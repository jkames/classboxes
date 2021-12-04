import java.util.HashSet;

class Product{
    int id;
    String name;
    double price;
    Product(){
        this.id = 0;
        this.name ="";
        this.price = 0.0;
    }
    int getId(){
        return this.id;
    }
    void setId(int id){
        this.id = id;
    }

    String getName(){
        return this.name;
    }
    void setName(String name){
       this.name = name;
    }

    double getPrice(){
        return this.price;
    }
    void setPrice(double price){
        this.price = price;
    }
}

class ecommerce{
    HashSet<Product>hset = new HashSet<>();
    void addProduct(Product p){
       hset.add(p);
    }
    void order(String productName){
            for(Product p : hset){
                if(p.getName().equals(productName)){
                    System.out.println("product id: "+p.getId() + " price $:" + p.getPrice());
                    return;
                }
        }
        System.out.println("product not listed. please purchase something else");

    }
}
public class assignment14 {
    public static void main(String[] args) {
        ecommerce e = new ecommerce();
        Product p = new Product();
        p.setId(1);
        p.setName("coke");
        p.setPrice(.8);
        e.addProduct(p);

        e.order("coke");
        e.order("apple");
    }
}
