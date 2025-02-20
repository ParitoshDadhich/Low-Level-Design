package proxyDesignPattern.employeeDB;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, Employee employee) throws Exception {
        System.out.println("Created a new row in the Employee table!");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("Deleted a row with employeeId: " + employeeId);
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        System.out.println("Fetching data from DB, employeeId: " + employeeId);
        return new Employee();
    }
}
