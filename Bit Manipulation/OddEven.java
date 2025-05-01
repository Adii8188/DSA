public class OddEven{
    public static void oddEven(int n){
        int t=(n&1);
        if(t!=0){
            System.out.println("Number is Odd:");
        }else{
            System.out.println("Number is Even :");
        }
    }
    public static void ithBit(int n,int i){
        int bitmask=(1<<i);
        if((n & bitmask)==0){
            System.out.println(i+" th bit is 0");
        }else{
            System.out.println(i+" th bit is 1");
        }
    }
    public static void setIthBit(int n,int i){
        int bitmask=(1<<i);
        int setbit=(n|bitmask);
        System.out.println(setbit);
    }
    public static int clearIthBit(int n,int i){
        int bitmask=~(1<<i);
        int clearbit=(n&bitmask);
        System.out.println(clearbit);
        return clearbit;
    }
    public static void updateIthBit(int n,int i,int newbit){
        n=clearIthBit(n,i);
        int bitmask=(newbit<<i);
        int t=n|bitmask;
        System.out.println(t);
    }
    public static void clearLastIBits(int n,int i){
        int bitmask=(~0<<i);
        int result=(n&bitmask);
        System.out.println(result);
    }
    public static void clearRangeOfBit(int n,int i,int j){
        int a=(~(~0<<j+1)+1);
        System.out.println(a);
        int b=((1<<i)-1);
        System.out.println(b);
        int bitmask=(a|b);
        int result=(n&bitmask);
        System.out.println(result);
    }
public static void main(String arg[]){
    int n=3;
    oddEven(n);
    ithBit(n,2);
    setIthBit(n,2);
    int nn=clearIthBit(n,3);
    updateIthBit(n,2,0);
    clearLastIBits(n,2);
    int m=73;
    clearRangeOfBit(m,2,5);
    //System.out.println((1<<2)-1);
}
}