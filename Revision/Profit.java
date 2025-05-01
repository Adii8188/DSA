public class Profit{
    public static int pro(int nums[]){
        int sp=0,bp=Integer.MAX_VALUE,maxp=0;
        for(int i=0;i<nums.length;i++){
            sp=nums[i];
            if(bp<sp){
                maxp=Math.max(maxp,(sp-bp));
            }else{
                bp=nums[i];
            }
        }
        return maxp;
    }

public static void main(String arg[]){
    int arr[]={7,1,5,3,6,4};
    int r=pro(arr);
    System.out.println(r);
}
}