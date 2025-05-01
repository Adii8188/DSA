public class random{
    public static int numPrimeArrangements(int n) {
        int count1=0,count2=0;
        int res1=0,res2=0,res=0;
        for(int i=1;i<=n;i++){
            for(int j=2;j<=n;j++){
             if(n%i==0){
                System.out.println(i);
                count2++;
            }else{
                //System.out.println(i);
                count1++;
            }
            }
        }
        res1=fun(count1);
        //System.out.println(res1);
        res2=fun(count2);
        //System.out.println(res1);
        res=res1*res2;
        return res;
    }
    public static int fun(int n){
        int sum=0;
        if(n==1){
            sum=1;
        }else{
            sum=n+fun(n-1);
        }
        return sum;
    }
    public static void prime(int n){
        for(int i=1;i<=n;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    System.out.println("Prime "+i);
                }else{
                    System.out.println("not RPime "+i);
                }
            }
        }
    }
public static void main(String arg[]){
    int n=5;
    prime(n);
    //int nn=numPrimeArrangements(n);
    System.out.println();
}
}