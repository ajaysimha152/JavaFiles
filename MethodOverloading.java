//package CoreJava;
import java.util.*;
class Calculator{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public double add(double n1,int n2){
        return n1+n2;
    }
}
public class MethodOverloading {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        Calculator c=new Calculator();
        //System.out.println("Please specify no of inputs and input countains double r not");
        //int n=s.nextInt();
        //boolean v=s.hasNextBoolean();
        System.out.println("Enter n1");
        int n1=s.nextInt();
        System.out.println("Enter d1");
        double d1=s.nextDouble();
        System.out.println("Enter n2");
        int n2=s.nextInt();
        System.out.println("Enter n3");
        int n3=s.nextInt();
        int sum=0;
        if(d1==0 && n3==0){
            sum=c.add(n1, n2);
        }
        else if(d1==0 && n3!=0){
            sum=c.add(n1, n2, n3);
        }
        else
        sum=c.add(n1, n2);
        System.out.println(sum);

    }

    
}
