import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        System.out.println("enter two numbers and a symbol to calculate");
        int num1 = myscan.nextInt();
        int num2 = myscan.nextInt();
        String symbol = myscan.next();

        switch(symbol){
            case "+":{
                System.out.println(num1+num2);
                break;
            }
            case "-":{
                System.out.println(num1-num2);
                break;
            }
            case "*":{
                System.out.println(num1*num2);
                break;
            }
            case "/":{
                System.out.println(num1/num2);
                break;
            }
        }
    }
}
