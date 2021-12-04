import java.util.Scanner;

public class assignment6 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = myObj.next();
        int start, end;
        boolean pal = true;
        if(str == ""){
            System.out.println("no input");
        }
        start = 0;
        end = str.length()-1;
        while(start <= end){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }
            else{
                pal = false;
                break;
            }
        }
        System.out.println(pal);
    }
}
