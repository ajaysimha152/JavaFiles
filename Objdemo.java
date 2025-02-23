//package CoreJava;
import java.util.*;
class Calculator{
    public int add(int n1,int n2){
        return n1+n2;
    }
}

class Objdemo
{
    public static void main(String args[]){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter first number num1:");
        int num1=scr.nextInt();
        System.out.println("Enter the second number num2:");
        int num2=scr.nextInt();
        Calculator cal=new Calculator();
        System.out.println(cal.add(num1, num2));
        
        }
    }