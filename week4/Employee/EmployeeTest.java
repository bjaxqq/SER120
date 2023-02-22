// creating Employee class
public class EmployeeTest {
    // creating main function
    public static void main(String[] args) {
        // creating objects correlating to the 3 employees in the table
        Employee job1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee job2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee job3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        // printing the information of employee #1
        System.out.println("Name: " + job1.getName());
        System.out.println("ID Number: " + job1.getIdNumber());
        System.out.println("Department: " + job1.getDepartment());
        System.out.println("Position: " + job1.getPosition());

        System.out.println("Name: " + job2.getName());
        System.out.println("ID Number: " + job2.getIdNumber());
        System.out.println("Department: " + job2.getDepartment());
        System.out.println("Position: " + job2.getPosition());
        
        System.out.println("Name: " + job3.getName());
        System.out.println("ID Number: " + job3.getIdNumber());
        System.out.println("Department: " + job3.getDepartment());
        System.out.println("Position: " + job3.getPosition());
    }
}