import java.util.*;
public class Diamond{
    public static void Diamond(int n){
        int t=0;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            for(int i=1;i<=(row*2)-1;i++){
                System.out.print("* ");
            }
            //t++;
            System.out.println();
        }
            for(int row=n;row>=1;row--){
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            for(int i=1;i<=(row*2)-1;i++){
                System.out.print("* ");
            }
            //t++;
            System.out.println();
        }
    }
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Diamond(n);
    System.out.println();
}
}