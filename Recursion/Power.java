public class Power{
    public static int pow(int x,int n){
        if(n==1){
            return x*n;
        }else{
            x=x*pow(x,n-1);
        }
        return x;
    }
    public static int pow1(int x,int n){
        if(n==1){
            return x*n;
        }else if(n%2==0){
            x=pow1(x,n/2)*pow1(x,n/2);
        }else{
            x=x*pow1(x,n/2)*pow1(x,n/2);
        }
        return x;
    }
public static void main(String arg[]){
    int r=pow1(5,5);
    System.out.println(r);
}
}