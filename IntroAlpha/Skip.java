import java.util.*;
public class Skip{
public static void main(String arg[]){
    int n;
    Scanner sc=new Scanner(System.in);
    
    do{
      System.out.println("ENetr the number :");
      n=sc.nextInt();
      char ch=sc.next().charAt(0);
      if(n%10==0){
        continue;
      }
      System.out.println("this number is not multiple of the 10:"+n);
    }while(true);
    
}
}