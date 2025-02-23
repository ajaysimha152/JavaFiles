//package CoreJava;
public class Arrays3d {
    public static void main(String[]args){
    int a[][][]=new int[3][3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            for(int k=0;k<3;k++){
                a[i][j][k]=(int)(Math.random()*10);
            }
            //System.out.println();
        }
        //System.out.println();

    }
    for(int s[][]:a){
        for(int o[]:s){
            for(int x:o){
                System.out.print(x+" ");

            }
            //System.out.println();
            
        }
        System.out.println();
    }
}
}
