public class Problem50{
        public static double myPow(double x, int n) {
        double ans=1;
        long N=n;
        if(N<0){
            x=1/x;
            N=-N;
        }
        while(N>0){
            if((N&1)==0){
                ans=ans*1;
                x=x*x;
                N=N>>1;
            }else{
                ans=ans*x;
                x=x*x;
                N=N>>1;
            }
        }
        return ans;
    }
public static void main(String arg[]){
    double n=2;
    int pow=-2;
    double r=myPow(n,pow);
    System.out.println(r);
}
}