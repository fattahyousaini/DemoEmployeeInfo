package sg.edu.rp.c346.demoemployeeinfo;

public class Employee {

    private String name;
    private String role;
    private double income;

    public Employee(String name, String role, double income) {
        this.name = name;
        this.role = role;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
    public String toString() {
        return name + ':' + '\'' + role + ":" + '\'' + income;
    }
}
