package proxyDesignPattern.employeeDB;

public class EmployeeDaoProxy implements EmployeeDao {
    EmployeeDao employeeDao;
    EmployeeDaoProxy(EmployeeDao employeeDao){
        this.employeeDao = employeeDao;
    }


    @Override
    public void create(String client, Employee employee) throws Exception {
        if(client.toLowerCase().equals("admin")){
            this.employeeDao.create(client, employee);
            return;
        }

        throw new Exception("Access Denied!");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if(client.toLowerCase().equals("admin")){
            this.employeeDao.delete(client, employeeId);
            return;
        }

        throw new Exception("Access Denied!");
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        if(client.toLowerCase().equals("admin") || client.toLowerCase().equals("user")){
            return this.employeeDao.get(client, employeeId);
        }
        throw new Exception("Access Denied!");
    }
}
