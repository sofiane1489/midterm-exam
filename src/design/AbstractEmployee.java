package design;

public abstract class AbstractEmployee implements Employee {
    protected String name;
    protected int employeeID;
    protected int benifits;
    protected int salary;
    public AbstractEmployee(String name, int employeeId) {
        this.name = name;
        this.employeeID = employeeId;
    }


    public AbstractEmployee(int employeeId) {
        this.employeeID = employeeId;
    }

    public AbstractEmployee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeID;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeID = employeeId;
    }

    public int getBenifits () {
        return benifits;
    }



    public void setBenifits(int bnf) {
        //this.benifits = bnf;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int calculateSalary() {
        return this.salary;
    }

    public abstract int calculateEmployeeBonus(int numberOfYearsWithCompany);

    public abstract int calculateEmployeePension();
}
