public class Problem122{
        public static int maxProfit(int[] prices) {
        int bp=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int sp=0,p=0;
        for(int i=0;i<prices.length;i++){
            if(i==0){
                bp=prices[i];
                sp=prices[i];
                p=p+(sp-bp);
            }else{
            sp=prices[i];
            if(bp>sp){
                bp=sp;
            }else{
                p=p+(sp-bp);
                bp=sp;
            }
            }
        }
        System.out.print(p);
        return p;
    }
public static void main(String arg[]){
    int arr[]={7,1,5,3,6,4};
    maxProfit(arr);
    System.out.println();
}
}