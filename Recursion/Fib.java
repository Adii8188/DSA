public class Fib{
    public static int fibo(int n){
        int fn=0;
        if(n==0 || n==1){
            return n;
        }else{
            fn=fibo(n-1)+fibo(n-2);
            return fn;
        }
    }
public static void main(String arg[]){
    int n=5;
    int r=fibo(5);
    System.out.println(r);
}
}