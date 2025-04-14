public class Probelm75{
        public static void sortColors(int[] nums) {
        int temp;
        for(int i=0;i<=nums.length-2;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
public static void main(String arg[]){
    int arr[]={2,0,2,1,1,0};
    sortColors(arr);
    System.out.println();
}
}