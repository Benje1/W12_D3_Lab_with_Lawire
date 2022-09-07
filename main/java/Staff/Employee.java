package Staff;

public abstract class Employee {

    protected String name;
    protected String ni;
    protected double salary;

    public Employee(String name, String ni, double salary) {
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNi() {
        return ni;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double increase){
        if(increase >= 0) {
            this.salary += increase;
        }
    }

    public double payBonus(){
        double bonus = this.salary / 100;
        return bonus;
    }

    public void setName(String name) {
        if(nameNotNull(name)){
        this.name = name;
        }
    }

    public boolean nameNotNull(String setName){
        if(setName == null || setName == ""){
            return false;
        } else {
            return true;
        }
    }


    }
