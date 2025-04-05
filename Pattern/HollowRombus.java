import java.util.*;
public class HollowRombus{
    public static void hollowRom(int n){
        int row ,col,coll;
        for(row=1;row<=n;row++){
            for(col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            for(coll=1;coll<=n;coll++){
                if(row==1 || coll==1 || row==n || coll==n){
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
    hollowRom(n);
    System.out.println();
}
}