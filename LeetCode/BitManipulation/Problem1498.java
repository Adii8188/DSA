import java.util.*;
public class Problem1498{
        public static int numSubseq(int[] nums, int target) {
        int ans=0;
        Arrays.sort(nums);
        int temp[]=new int[nums.length];
        for(int i=0;i<temp.length;i++){
            if(i==0){
                temp[i]=1;
            }else{
                temp[i]=temp[i-1]*2;
            }
        }
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            if(nums[l]+nums[r]<=target){
                ans=ans+temp[r-l];
                l++;
            }else{
                r--;
            }
        }
        return ans;
    }
public static void main(String arg[]){
    int arr[]={2,3,3,4,6,7};
    int arr1[]={14,4,6,6,20,8,5,6,8,12,6,10,14,9,17,16,9,7,14,11,14,15,13,11,10,18,13,17,17,14,17,7,9,5,10,13,8,5,18,20,7,5,5,15,19,14};
    int r=numSubseq(arr,12);
    System.out.println(r);
}
}