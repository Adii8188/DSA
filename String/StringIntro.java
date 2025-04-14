import java.util.*;
public class StringIntro{
    public static void print(String s){
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }
    }
public static void main(String arg[]){
    String name="Shraddha";
    Scanner sc=new Scanner(System.in);
     String name1="Shradha";
     //name1=sc.nextLine();
    int a=name.length();
    System.out.println(a);
    print(name);
    
}
}