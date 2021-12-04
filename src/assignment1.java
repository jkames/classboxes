import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("input electricity bill");

        int amount = myObj.nextInt();
        int total = 0;

        if(amount > 400){
            total = (50*1)+(50*2)+(100*3)+(200*4)+((amount-400)*5);
        }
        else if(amount > 200){
             total = (50*1)+(50*2)+(100*3)+((amount-200)*4);
        }
        else if(amount > 100){
            total = (50*1)+(50*2)+((amount-100)*3);
        }
        else if(amount > 50){
            total = (50*1)+((amount-50)*2);
        }
        else
            total = amount;

        System.out.println(total);
    }
}
