package week2;

import java.util.Calendar;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0; // No tax applied.
        } else {
            return salary * 0.03; // 3% of the salary as tax.
        }
    }

    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30; // Calculate bonus for extra hours worked.
        } else {
            return 0; // No bonus for extra hours worked.
        }
    }

    public void raiseSalary() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int yearsWorked = currentYear - hireYear;

        if (yearsWorked < 10) {
            salary *= 1.05; // 5% raise
        } else if (yearsWorked < 20) {
            salary *= 1.10; // 10% raise
        } else {
            salary *= 1.15; // 15% raise
        }
    }

    @Override
    public String toString() {
        return "week2.Employee{name='" + name + "', salary=" + salary + ", workHours=" + workHours + ", hireYear=" + hireYear + '}';
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Cuneyt Can Iscan", 12000, 70, 2010);
        System.out.println("week2.Employee Information:");
        System.out.println(employee);

        System.out.println("Tax: " + employee.tax());
        System.out.println("Bonus: " + employee.bonus());

        employee.raiseSalary();
        System.out.println("Updated Salary: " + employee.getSalary());
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}