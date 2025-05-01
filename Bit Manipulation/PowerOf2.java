public class PowerOf2{
    public static boolean powerOf2(int n){
        if((n & (n-1))==0){
            System.out.println("The number is Power of 2!");
            return true;
        }else{
            System.out.println("The number is not the Power of 2!");
            return false;
        }
    }
public static void main(String arg[]){
    int n=62;
    boolean b=powerOf2(n);
    System.out.println(b);
}
}