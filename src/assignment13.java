import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class assignment13 implements IEmployeeDao{
    List<Employee>empList = new ArrayList<>();

    @Override
    public List<Employee> getEmployees() {
        return empList;
    }

    @Override
    public void insertEmployee(Employee emp) {
        this.empList.add(emp);
    }

    @Override
    public void insertEmployees(List<Employee> emp) {
        this.empList.addAll(emp);
    }

    public static void main(String[] args) {
        IEmployeeDao dao = new assignment13();
        List<Employee>empList = new ArrayList<>();
        while(true){
            System.out.println("Enter name, id, salary, deptid");
            Scanner myscan = new Scanner(System.in);
            String name = myscan.nextLine();
            int id = myscan.nextInt();
            double sal = myscan.nextDouble();
            int deptid = myscan.nextInt();
            Employee temp = new Employee();

            temp.setName(name);
            temp.setId(id);
            temp.setSalary(sal);
            temp.setDeptId(deptid);
            empList.add(temp);

            Scanner scaner2 = new Scanner(System.in);
            System.out.println("continue? (y/n)");
            String reply = scaner2.nextLine();
            if(reply.equals("n"))
                break;
        }
        dao.insertEmployees(empList);
        empList = dao.getEmployees();
        for(Employee e : empList){
            System.out.println(e.getName() + " " + e.getId() + " " + e.getSalary() + " " + e.getDeptId());
        }
    }
}
