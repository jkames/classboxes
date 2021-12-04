abstract class Print implements Bill{

   public abstract void printBill(double amount);
}

class Powerbill extends Print{
    @Override
    public double calcBill(int units) {
        return 0;
    }

    @Override
    public void printBill(double amount) {

    }
}

class WaterBill extends Print{
    @Override
    public double calcBill(int units){
        return 0.0;
    }

    @Override
    public void printBill(double amount){

    }
}
public class assignment9 {
    public static void main(String[] args) {


    }
}
