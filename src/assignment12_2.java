import java.util.Scanner;

public class assignment12_2 {
    public static class PinsMisMatchException extends Exception{
        public PinsMisMatchException(String s){
            super(s);
            System.out.println("Sorry... Your Account Has Been Locked");
        }
    }
    public static void main(String[] args) throws PinsMisMatchException {
        int count = 0;
        int pin = 0000;
        while(true){
            count++;
            if(count > 3){
                throw new PinsMisMatchException("Attempted more than 3 times");
            }
            System.out.print("Enter PIN Nunber: ");
            Scanner myscan = new Scanner(System.in);
            int userInput = myscan.nextInt();
            if(userInput == pin){
                System.out.println("Correct Pin");
                break;
            }
        }
    }
}
