public class Product {
    String name;
    double price;
    int quantity;

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

    int getQuantity(){
        return this.quantity;
    }
    void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
