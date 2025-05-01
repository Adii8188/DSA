public class CountReatedBit{
    public static void count1InNumber(int n){
        int count=0;
        while(n>0){
            if((n & 1)!=0){
                count++;
                n=n>>1;
            }else{
                n=n>>1;
            }
        }
        System.out.println(count);
    }
public static void main(String arg[]){
    int n=11;
    count1InNumber(n);
    System.out.println();
}
}