import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public class assignment15 {
    public static void main(String[] args) {
        try(InputStream input = assignment15.class.getClassLoader().getResourceAsStream("assignment15.properties")){
           Properties prop = new Properties();

           if(input == null){
               System.out.println("Sorry, unable to find properties file");
               return;
           }
           prop.load(input);

            System.out.println("enter name to get number: ");
            Scanner scan = new Scanner(System.in);
            String name = scan.next();
            System.out.println(prop.getProperty(name+".num"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
