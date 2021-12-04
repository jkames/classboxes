abstract class Shape{
    int base;
    int height;

    abstract double printArea();
}

class Rectangle extends Shape{
    Rectangle(){
        this.base = 0;
        this.height = 0;
    }
    Rectangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    @Override
    double printArea() {
        return this.base * this.height;
    }
}

class Triangle extends Shape{
    Triangle(){
        this.base = 0;
        this.height = 0;
    }
    Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    @Override
    double printArea(){
        return .5 * this.base * this.height;
    }
}

class Circle extends Shape{
    int radius;
    Circle(){
        this.base = 0;
        this.height = 0;
        this.radius = 0;
    }
    Circle(int radius){
        this.radius = radius;
    }

    @Override
    double printArea(){
        return radius * radius * 3.14;
    }

}
public class assignment11 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(3,4);
        System.out.println(rec.printArea());

        Circle cir = new Circle(3);
        System.out.println(cir.printArea());

        Triangle tri = new Triangle(1,2);
        System.out.println(tri.printArea());
    }
}
