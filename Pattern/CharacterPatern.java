import java.util.*;
public class CharacterPatern{
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    char ch='A';
    for(int i=1;i<=a;i++){
        for(int j=1;j<=i;j++){
            System.out.print(ch);
            ch++;
        }
        System.out.print("\n");
    }
    
}
}