public class StockBuySell{
    public static void stock(int arr[]){
        int bp=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int sp=0,p=0;
        for(int i=0;i<arr.length;i++){
            if(i==0){
                bp=arr[i];
            }else{
            sp=arr[i];
            if(bp<sp){
                //bp=sp;
                p=sp-bp;
            
            }else{
                bp=sp;
            }
            }
             if(max<p){
                max=p;
            }
        }
        System.out.println("the maximum profit is :"+max);
    }
public static void main(String arg[]){
    int arr[]={7,1,5,3,6,4};
    int arr1[]={7,6,4,3,1};
    stock(arr1);
    System.out.println();
}
}