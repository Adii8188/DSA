public class Fact{
    public static int fact(int n){
        int fn=0;
        if(n==0){
            return 1;
        }else{
            fn=n*fact(n-1);
        }
        return fn;
    }
    public static int sum(int n){
        int sum=0;
        if(n==1){
            return 1;
        }else{
            sum=n+sum(n-1);
            return sum;
        }
    }
public static void main(String arg[]){
    int f=4;
    int r=fact(f);
    //int sum=sum(5);
    //System.out.println(r);
    System.out.println(sum(5));
}
}