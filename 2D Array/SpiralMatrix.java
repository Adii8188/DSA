import java.util.*;
public class SpiralMatrix{
    public static void spiral(int mat[][]){
        int top=0;
        int bottom=mat.length-1;
        int left=0;
        int right=mat[0].length-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                System.out.print(mat[top][i]+" ");
            }
            top++;
            for(int j=top;j<=bottom;j++){
                System.out.print(mat[j][right]+" ");
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    System.out.print(mat[bottom][i]+" ");
                }
                bottom--;
            }
            if(left<=right){
                for(int j=bottom;j>=top;j--){
                    System.out.print(mat[j][left]+" ");
                }
                left++;
            }
        }
    }
public static void main(String arg[]){
    int mat[][]=new int[5][5];
    Scanner sc=new Scanner(System.in);
    System.out.println("ENter the element for 2D matrix:");
    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            mat[i][j]=sc.nextInt();
        }
    }
    spiral(mat);
    System.out.println();
}
}