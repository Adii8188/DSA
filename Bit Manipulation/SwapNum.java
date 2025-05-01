public class SwapNum{
public static void main(String arg[]){
    int a=2,b=3;
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.println(a);
    System.out.println(b);
    System.out.println(~(~2)+1);
    System.out.println(~3);
}
}