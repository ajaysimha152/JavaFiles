abstract class Employee{
    protected String name;
    protected int employeeId;
    public Employee(String name,int employeeId){
        this.name=name;
        this.employeeId=employeeId;
    }
    public abstract double calculateSalary();
    public void displayInfo(){
        System.out.println("Employee ID:"+employeeId);
        System.out.println("Name: "+name);
    }
}
class FullTimeEmployee extends Employee{
    private double monthlySalary;
    public FullTimeEmployee(String name,int employeeId,double monthlySalary){
        super(name,employeeId);
        this.monthlySalary=monthlySalary;
    }
    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}
class contractEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;
    public contractEmployee(String name,int employeeId,double hourlyRate,int hoursWorked){
        super(name, employeeId);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }
    @Override
    public double calculateSalary(){
        return hourlyRate*hoursWorked;
    }
}



public class Abstractclass {
    public static void main(String[]args){

        FullTimeEmployee emp1=new FullTimeEmployee("Ajay",101,50000);
        contractEmployee emp2=new contractEmployee("Dileep", 102, 200, 160);
        emp1.displayInfo();
        System.out.println("Salary: "+emp1.calculateSalary());
        System.out.println();
        emp2.displayInfo();
        System.out.println("Salary: "+emp2.calculateSalary());
    }

    
}
