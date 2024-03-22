import java.util.ArrayList;
import java.util.List;


public class Directory {

    private List<Employee> employees;

    public Directory() {
        this.employees = new ArrayList<>();
    }

    public List<Employee> findEmployeeByExperience(int experience) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getExperience() == experience) {
                result.add(employee);
            }
        }
        return result;
    }


    public String getPhoneNumberByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee.getPhoneNumber();
            }
        }
        return null;
    }

    public Employee findEmployeeById(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
