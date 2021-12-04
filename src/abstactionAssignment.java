import java.text.DecimalFormat;

abstract class Restaurant{
    abstract void printName();
    abstract void totalPrice();
    abstract void menu();
}
class McD extends Restaurant{
    String name;
    double price;
    McD(){
        this.name = "";
        this.price = 0;
    }
    McD(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    void printName() {
        System.out.println(this.name);
    }

    @Override
    void totalPrice() {
        DecimalFormat two = new DecimalFormat("#0.00");
        System.out.println(two.format((0.06*this.price)+this.price));
    }

    @Override
    void menu() {
        System.out.println("menu");
    }
}
class Kfc extends Restaurant{
    String name;
    double price;
    Kfc(){
        this.name = "";
        this.price = 0.0;
    }
    Kfc(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    void printName() {
        System.out.println(this.name);
    }

    @Override
    void totalPrice() {
        DecimalFormat two = new DecimalFormat("#0.00");
        System.out.println(two.format((0.06*this.price)+this.price));
    }

    @Override
    void menu() {
        System.out.println("menu");
    }
}
public class abstactionAssignment {
    public static void main(String[] args) {
        Kfc k = new Kfc("fried chicken", 3.2);
        k.printName();
        k.totalPrice();

        McD m = new McD("cheeseburger", 1.2);
        m.printName();
        m.totalPrice();
    }
}
