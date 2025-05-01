public class Problem191{
        public static int hammingWeight(int n) {
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
                n=n>>1;
            }else{
                n=n>>1;
            }
        }
        return count;
    }
public static void main(String arg[]){
    int n=11;
    int count=hammingWeight(n);
    System.out.println(count);
    System.out.println(2^2);
}
}