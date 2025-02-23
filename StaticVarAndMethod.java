import java.util.*;
class Bike{
    static int empsal=2000000;
    String cname;
    String model;
    int cost;
    String colour;
    static void show(Bike b){
            System.out.println(b.cname+" bought "+b.model+" bike of colour "+b.colour+" for the cost of "+b.cost+" Rs.");

    }
    static void show(Car c){
        System.out.println(c.cname+" bought "+c.model+" bike of colour "+c.colour+" for the cost of "+c.cost+" Rs.");

}
}
class Car{
    String cname;
    String model;
    int cost;
    String colour;

}
class StaticVarAndMethod{
    public static void main(String[]args){
        Bike b1=new Bike();
        Car c1=new Car();
        b1.cname="Dileep";
        b1.colour="Black";
        b1.model="Enfield Himalayan";
        b1.cost=240000;
        c1.cname="Ajay";
        c1.model="Lamborgoni";
        c1.colour="Red";
        c1.cost=10000000;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Your Annual Package");
        int emp_Anual_Package=s.nextInt();
        System.out.println("Enter type of vehicle need to buy ex:car or bike");
        String vehicle=s.next();
        if((emp_Anual_Package>=Bike.empsal)&&(vehicle.equals("bike"))){
            Bike.show(b1);

        }
        else if((emp_Anual_Package>=Bike.empsal)&&(vehicle.equals("car"))){
            Bike.show(c1);
        }
        else{
            System.out.println("You are not eligible for buying car or bike min package is 2000000 per Anum");
        }

    }



}