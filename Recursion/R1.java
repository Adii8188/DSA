public class R1{
    public static void fun(int n){
        if(n==1){
            System.out.println(1);
        }else{
            System.out.println(n);
            fun(n-1);
        }
    }
    public static void fun1(int n){
        if(n==1){
            System.out.println(1);
            return ;
        }
        else{
            fun1(n-1);
            System.out.println(n);
        }
    }
public static void main(String arg[]){
    int n=10;
    //fun(n);
    fun1(9);
    System.out.println();
}
}