import java.util.*;
public class InvHalfPy{
    public static void halfpy(int n){
        int row,col;
        for(row=1;row<=n;row++){
            for(col=n-row;col>0;col--){
                System.out.print(" ");
            }
            for(int i=1;i<=row;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    halfpy(n);
    System.out.println();
}
}