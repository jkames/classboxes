import java.util.Scanner;

public class assignment2_1 {
    public static void main(String[] args) {
        while(true){
            Scanner myscan = new Scanner(System.in);
            System.out.println("ABC Banking Menu");
            System.out.println("1. Create Account");
            System.out.println("2. Credit Money");
            System.out.println("3. Debit Money");
            System.out.println("4. Transfer");
            System.out.println("Please select option");
            int choice = myscan.nextInt();
            switch(choice){
                case 1:{
                    System.out.println("account created");
                    break;
                }
                case 2:{
                    System.out.println("amount is credited");
                    break;
                }
                case 3:{
                    System.out.println("debit money");
                    break;
                }
                case 4:{
                    System.out.println("successfully transferred");
                    break;
                }
            }
            System.out.println("Do you want to continue (y/n)");
            String reply = myscan.next();
            if(reply.equals("n"))
                break;
        }
        System.out.println("Thank you visit again...");

    }
}
