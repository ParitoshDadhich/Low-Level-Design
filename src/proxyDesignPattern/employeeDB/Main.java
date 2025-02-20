package proxyDesignPattern.employeeDB;

public class Main {
    public static void main(String[] args) throws Exception {
        EmployeeDao employeeDao = new EmployeeDaoProxy(new EmployeeDaoImpl());
        employeeDao.create("ADMIN", new Employee());
        employeeDao.get("ADMIN", 1233);
        employeeDao.get("USER", 456);
//        employeeDao.delete("USER", 123);
    }
}
