public class Rotate189{
        public static void rotate(int[] nums, int k) {
            reverse(nums,0,nums.length-1);
            print(nums);
            reverse(nums,0,k-1);
            reverse(nums,k,nums.length-1);
                System.out.println();
            print(nums);
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
            System.out.println();
    }


    public static void reverse(int arr[],int start,int end){
            while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
public static void main(String arg[]){
    int arr[]={1,2,3,4,5,6,7};
    rotate(arr,3);
        System.out.println();
    print(arr);
        System.out.println();
    System.out.println();
}
}