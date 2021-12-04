import java.util.List;

public interface IEmployeeDao {
    List<Employee> getEmployees();
    void insertEmployee(Employee emp);
    void insertEmployees(List<Employee>emp);

}
