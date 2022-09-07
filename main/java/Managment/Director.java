package Managment;

public class Director extends Manager{

    private double buget;

    public Director(String name, String ni, double salary, String deptName, double buget) {
        super(name, ni, salary, deptName);
        this.buget = buget;
    }

    public double getBuget() {
        return buget;
    }

    @Override
    public double payBonus(){
        double bonus = this.salary / 100;
        bonus = bonus + bonus;
        return bonus;
    }
}
