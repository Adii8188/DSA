public class Problem33{
        public static int search(int[] nums, int target) {
        int t=-1;
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target==nums[mid]){
                t=mid;
                break;
            }
            if(nums[start]<=nums[mid]){
                if(target>=nums[start] && target<=nums[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target>=nums[mid] && target<=nums[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return t;
    }
public static void main(String arg[]){
    int arr[]={4,5,6,7,0,1,2};
    int t=search(arr,0);
    System.out.println(t);
}
}