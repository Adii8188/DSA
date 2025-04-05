import java.util.*;
 class Divin{
public static void main(String arg[]){
    int x;
    char c;
    String s;
    Scanner sc=new Scanner(System.in);
    do{
        System.out.println("Please Enter the number that not divisible by 10:");
        x=sc.nextInt();
        //System.out.println("you want to enter more numbers :");
        // s=sc.next();
        // c=s.charAt(0);
        // if(x%10==0){
        //     break;
        // }
    }while(x%10!=0);
    System.out.println("You enter the number which is divisible from the 10;");
}
}