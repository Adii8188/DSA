public class FastExponential{
    public static int exponential(int num,int pow){
    int a=num;
    int n=pow;
    int ans=1;
    while(n>0){
        if((n&1)==0){
            ans=ans*1;
            a=a*a;
            n=n>>1;
        }else{
            ans=ans*a;
            a=a*a;
            n=n>>1;
            }
        }
        return ans;
    }
public static void main(String arg[]){
    int ans=exponential(8,5);
    System.out.println(ans);
    System.out.println((~(-2)+1));
    System.out.println(Math.pow(2,-2));
}
}