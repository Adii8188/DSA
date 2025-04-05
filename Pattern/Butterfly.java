import java.util.*;
public class Butterfly{
    public static void butter(int n){
        //int row, col;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
                for(int i=1;i<=(n-row)*2;i++){
                    System.out.print("  ");  
            }
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=n;row>=1;row--){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
                for(int i=1;i<=(n-row)*2;i++){
                    System.out.print("  ");  
            }
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    butter(n);
    System.out.println();
}
}