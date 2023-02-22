// creating Employee class
public class Employee {
    // initializing member variables
    private String name;
    private int idNumber;
    private String department;
    private String position;

    // creating constructor with all member variables (name, ID number, department, and position)
    public Employee(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    // creating constructor with just the name and ID numbers, and the department and position set to an empty string
    public Employee(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }

    // creating default constructor
    public Employee() {
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = ""; 
    }

    // setters and getters for Name variable
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    // setters and getters for ID Number variable
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    public int getIdNumber() {
        return this.idNumber;
    }

    // setters and getters for Department variable
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return this.department;
    }

    // setters and getters for Position variable
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return this.position;
    }
}