public class TrappedWater{
    public static int  tp(int nums[]){
        int leftmax[]=new int[nums.length];
        int rightmax[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                leftmax[i]=nums[i];
            }else{
                leftmax[i]=Math.max(leftmax[i-1],nums[i]);
            }
        }

        for(int i=nums.length-1;i>=0;i--){
            if(i==nums.length-1){
                rightmax[i]=nums[i];
            }else{
                rightmax[i]=Math.max(rightmax[i+1],nums[i]);
            }
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int wl=Math.min(leftmax[i],rightmax[i]);
            int tp=wl-nums[i];
            sum=sum+tp;
        }
        return sum;
    }

public static void main(String arg[]){
    int arr[]={4,2,0,6,3,2,5};
    int r=tp(arr);
    System.out.println(r);
}
}