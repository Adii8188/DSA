import java.util.Scanner;
public class Reverse{
public static void main(String arg[]){
    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();
    int t=0;
    while(n!=0){
      int j=n%10;
      t=t*10+j;
      n/=10;
    }
    System.out.println(t);
    Sc.close();
}
}