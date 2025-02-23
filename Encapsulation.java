//Encapsulation is the process of binding Variables and Methods in side the class it can be achieved by using private 
//Access Modifyier and there priviate entities can be Accessed get or set methods.
import java.util.*;
class Employee_details{
    String  Name="Ajay Simha Raju";
    private int acc_number;
    private int annualPackage;
    public void setAccNumber(int an){
        acc_number=an;
    }
    public  int getAccNumber(){
        return acc_number;
    }

}
class Encapsulation{
    public static void main(String[]args){
        Employee_details e1=new Employee_details();
        e1.setAccNumber(1520818166);
        int acc_number=e1.getAccNumber();
        System.out.println(acc_number);

    }
}

