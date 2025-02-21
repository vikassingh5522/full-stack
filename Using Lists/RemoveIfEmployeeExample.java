import java.util.*;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " - " + salary;
    }
}

public class RemoveIfEmployeeExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee("Alice", 60000),
            new Employee("Bob", 40000),
            new Employee("Charlie", 50000),
            new Employee("David", 45000)
        ));

        // Removing employees with salary < 50,000
        employees.removeIf(emp -> emp.salary < 50000);

        System.out.println("Employees after removeIf: " + employees);
    }
}
