package NIIT_Revision;

public class Employee {

    String employeeName;
    String address;
    int age;
    double salary;

    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee.employeeName);
        System.out.println(employee.salaryHike(10000));
    }


    public double salaryHike(double salary){
        salary = salary + (salary * 0.10);
        return salary;
    }

}
