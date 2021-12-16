import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dao {
    public List<Product> getProducts() {
        Connection connection = DBUtil.getDBConnection();
        List<Product>pList = new ArrayList<Product>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select P_NAME, P_Price, P_Quantity, from PRO");
            while(resultSet.next()){
                Product p = new Product();
                p.setName(resultSet.getString("P_NAME"));
                p.setPrice(resultSet.getDouble("P_Price"));
                p.setQuantity(resultSet.getInt("P_Quantity"));
                pList.add(p);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pList;
    }
    public void insertProduct(Product p) {
        int recordsInserted = 0;
        Connection connection = DBUtil.getDBConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Pro(P_Name, P_Price, P_Quantity) values (?,?,?)");
            preparedStatement.setString(1, p.getName());
            preparedStatement.setDouble(2, p.getPrice());
            preparedStatement.setInt(3,p.getQuantity());

            recordsInserted = preparedStatement.executeUpdate();
            connection.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        dao pdao = new dao();
        Product p = new Product();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product information: ");
        p.setName(scanner.next());
        p.setPrice(scanner.nextInt());
        p.setQuantity(scanner.nextInt());
        pdao.insertProduct(p);
        pdao.getProducts();
    }
}
