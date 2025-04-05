import java.util.*;
public class FlydePy{
    public static void Flyd(int n){
        int t=1,row,col;
        for(row=1;row<=n;row++){
            for(col=1;col<=row;col++){
                System.out.print(t+" ");
                t++;
            }
            System.out.println();
        }
    }
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Flyd(n);
    System.out.println();
}
}