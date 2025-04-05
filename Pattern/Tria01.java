import java.util.*;
public class Tria01{
    public static void fun01(int n){
        int row,col;
        for(row=1;row<=n;row++){
            for(col=1;col<=row;col++){
                if((row+col)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    fun01(n);
    System.out.println();
}
}