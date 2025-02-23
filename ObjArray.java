//package CoreJava;

class Student {
    String name;
    int rno;
    int marks; 
}
public class ObjArray {
    public static void main(String[]args){
        Student s1=new Student();
        s1.name="Ajay";
        s1.rno=152081;
        s1.marks=95;
        Student s2=new Student();
        s2.name="Dileep";
        s2.rno=145678;
        s2.marks=98;
        Student s3=new Student();
        s3.name="Riteesh";
        s3.rno=167542;
        s3.marks=90;
        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        for(int i=0;i<3;i++){
            System.out.println(students[i].name+" "+students[i].rno+" "+students[i].marks);
        }
    }
    
}
