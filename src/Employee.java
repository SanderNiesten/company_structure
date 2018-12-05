public abstract class Employee {

    //variables
    private String name;
    public double baseSalary;
    private int employeeID;
    private static int count = 0;

    //constructor
    public Employee(String name, double baseSalary) {
        count++;
        this.name = name;
        this.baseSalary = baseSalary;
        employeeID = count;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    //Should return the employee's ID. The ID should be issued on behalf of the employee at the time they are constructed.
    // The first ever employee should have an ID of "1", the second "2" and so on
    public int getEmployeeID() {
        return employeeID;
    }

    //Should return a reference to the Employee object that represents this employee's manager
    public Employee getManager() {
        return;
    }

    public boolean equals(Employee other) {
        return this.getEmployeeID() == other.getEmployeeID(); //Should return true if the two employee IDs are the same, false otherwise
    }

    public String toString() {
        return getEmployeeID() + " " + getName();
    }

    //Should return a String representation of that Employee's current status.
    //This will be different for every subclass of Employee
    public String employeeStatus() {
        return;
    }
}
