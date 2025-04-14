import java.util.*;
public class PelindomeString{
    public static void pelindrome(String s){
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int l=s.length()-1;
        boolean b=true;
        for(int i=0;i<l/2;i++){
            if(s.charAt(i)!=s.charAt(l-i)){
                b=false;
                break;
                }
        }
        if(b==false){
            System.out.print("your String is not pelindrome!");
        }else{
            System.out.print("Your String is pelindome!");
        }
    }
public static void main(String arg[]){
    String s="A man, a plan, a canal: Panama";

    pelindrome(s);
    System.out.println();
}
}