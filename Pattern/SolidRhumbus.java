import java.util.*;
public class SolidRhumbus{
    public static void solid(int n){
        int row,col;
        for(row=1;row<=n;row++){
            for(col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            for(col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    solid(n);
    System.out.println();
}
}