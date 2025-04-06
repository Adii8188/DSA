public class PrefixSum{
    public static void prefixsum(int arr[],int prefix[]){
        for(int i=0;i<prefix.length;i++){
            if(i==0){
                prefix[i]=arr[i];
            }else{
                prefix[i]=prefix[i-1]+arr[i];
            }
        }
    }
    public static void maxSubArrSum(int arr[],int prefix[]){
        int cs,ms=Integer.MIN_VALUE;
        for(int i=0;i<prefix.length;i++){
            for(int j=i+1;j<prefix.length;j++){
                if(i==0){
                    cs=prefix[j];
                }else{
                    cs=prefix[j]-prefix[i-1];
                }
                if(ms<cs){
                    ms=cs;
                }
            }
        }
        System.out.println("the maximum sum of subarray is :"+ms);
    }
public static void main(String arg[]){
    int arr[]={1,3,5};
    int prefix[]=new int[arr.length];
    prefixsum(arr,prefix);
    maxSubArrSum(arr,prefix);
    System.out.println();
}
}