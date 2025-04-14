import java.util.*;
public class Implementation{
    public static void input(int matrix[][]){
    Scanner sc=new Scanner(System.in);
    int n=matrix.length;
    int m=matrix[0].length;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            matrix[i][j]=sc.nextInt();
        }
    }
    }

    public static void search(int matrix[][], int find){
        int get=0,t=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(find==matrix[i][j]){
                    System.out.print("your record found at index :["+i+"]["+j+"]");
                    t++;
                }
            }
        }
        if(t==0){
            System.out.println("your record is invalid!");
        }
    }

    public static void print(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int matrix[][]=new int[3][3];
    // int n=matrix.length;
    // int m=matrix[0].length;
    // for(int i=0;i<n;i++){
    //     for(int j=0;j<m;j++){
    //         matrix[i][j]=sc.nextInt();
    //     }
    // }
    input(matrix);
    print(matrix);
    System.out.println();
    System.out.println("Eneter number you want to find :");
    int n=sc.nextInt();
    search(matrix,n);
    System.out.println();
}
}