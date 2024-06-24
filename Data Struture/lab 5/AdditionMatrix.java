import java.util.*;
public class AdditionMatrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[2][2];
        int[][] b=new int[2][2];
        int[][] ans=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j]=sc.nextInt();
                b[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                
                    ans[i][j]=a[i][j]+b[i][j];
                
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}