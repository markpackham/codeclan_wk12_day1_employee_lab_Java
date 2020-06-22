package staff;

public abstract class Employee {

    private String name;
    private String NI;
    protected double salary;

    public Employee(String name, String NI, double salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals("")){
            this.name = "Give me a name!";
        }
        else{
            this.name = name;
        }
    }

    public String getNI() {
        return NI;
    }

    public void setNI(String NI) {
        this.NI = NI;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double salaryIncrease){
        if(salaryIncrease > 0) {
            this.salary += salaryIncrease;
        }
        else{
            this.salary += 0;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }

}
