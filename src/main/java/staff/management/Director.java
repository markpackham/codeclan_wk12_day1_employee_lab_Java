package staff.management;

public class Director extends Manager{
    private double budget;
    //private double salary;

    public Director(String name, String NI, double salary, String deptName, double budget) {
        super(name, NI, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public double payBonus(){
        return this.salary * 0.02;
    }

}
