import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class assignment3 {
    public static void main(String[] args) {
       Scanner myscan = new Scanner(System.in);
       System.out.println("Enter a set of integers");

      List<Integer> list = new ArrayList<>();
      String str = myscan.nextLine();
      for(String i:str.split(" ")){
         list.add(Integer.parseInt(i));
      }
      int evensum = 0;
      int oddsum = 0;
      for(int x : list){
          if(x%2 == 0){
            evensum += x;
          }
          else
              oddsum += x;
      }
        System.out.println("even sum: " + evensum);
        System.out.println("odd sum: " + oddsum);

    }
}
