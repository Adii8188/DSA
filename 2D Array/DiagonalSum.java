import java.util.*;
public class DiagonalSum{
    public static void diagonal(int mat[][]){
        int sum=0;
        // for(int i=0;i<mat.length;i++){
        //     for(int j=0;j<mat[0].length;j++){
        //         if(i==j){
        //             sum=sum+mat[i][j];
        //         }else if(i+j==mat.length-1){
        //             sum=sum+mat[i][j];
        //         }
        //     }
        // }

        //Optimal solution 
        for(int i=0;i<mat.length;i++){
            sum=sum+mat[i][i];
            if(i != mat.length-1-i){
                sum=sum+mat[i][mat.length-1-i];
            }
        }


        System.out.print(sum);
    }
    public static void input(int mat[][]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                mat[i][j]=sc.nextInt();
            }
        }
    }
public static void main(String arg[]){
    int mat[][]=new int[3][3];
    //Scanner sc=new Scanner(System.in);
    input(mat);
    diagonal(mat);
    System.out.println();
}
}