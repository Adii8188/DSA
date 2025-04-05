import java.util.*;
public class NumberHalfPy{
    public static void NumHalfPy(int n){
        int row,col;
        for(row=n;row>=1;row--){
            for(col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    NumHalfPy(n);
    System.out.println();
}
}