public class JaggedArrays {
    public static void main(String[]args){
    int n=(int)(Math.random()*10);
    //int m=(int)(Math.random()*10);
    int [][]a=new int[n][];
    for(int i=0;i<n;i++){
        a[i]=new int[(int)(Math.random()*10)];
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<a[i].length-1;j++){
            a[i][j]=(int)(Math.random()*10);
        }
    }
    for(int []y:a){
        for(int x:y){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}

    
}
