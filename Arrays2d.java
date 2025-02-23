//package CoreJava;
public class Arrays2d {
    public static void main(String[]args){
        int[][]a=new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                a[i][j]=(int)(Math.random()*10);
            }
        }
        System.out.println("Displaying Array using nested for loop");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Displaying Array using Enhanced for loop");
        for(int []i:a){
            for(int x:i){
                System.out.print(x+" ");
            }
            System.out.println();
        }

    }
    
}
