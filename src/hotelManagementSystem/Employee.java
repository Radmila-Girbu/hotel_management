package hotelManagementSystem;

public class Employee extends Person {
    private int  salary;
    private String role;

    public Employee(String firstName, String lastName, Address adressPerson, Contact contactPerson, IdentityCard identityCard, int salary, String role) {
        super(firstName, lastName, adressPerson, contactPerson, identityCard);
        this.salary = salary;
        this.role = role;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
