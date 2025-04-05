import java.util.*;
public class HalfPyramid{
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    for(int i=1;i<=a;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.print("\n");
    }
    
}
}