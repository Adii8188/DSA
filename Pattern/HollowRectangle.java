import java.util.*;
public class HollowRectangle{
    public static void hlwRac(int n){
    int row,col;
    for(row=1;row<=n;row++){
        for(col=1;col<=n;col++){
            if(row==1 || col==1 || row==n || col==n){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    }
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    hlwRac(n);
    System.out.println();
}
}