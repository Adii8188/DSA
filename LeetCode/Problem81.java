public class Problem81{
        public static  boolean search1(int[] nums, int target) {
        boolean b=search(nums,target,0,nums.length-1);
        return b;
    }
        public static  boolean search(int arr[],int tar,int si,int ei){
        int mid=si+(ei-si)/2;
        if(arr[mid]==tar){
            return true;
        }
        if(si>ei){
            return false;
        }
        if(arr[si]==arr[mid] && arr[mid]==arr[ei]){
            return search(arr,tar,si+1,ei-1);
        }
        if(arr[si]<=arr[mid]){
            if(arr[si]<=tar && tar<arr[mid]){

                return search(arr,tar,si,mid-1);
            }else{

                return search(arr,tar,mid+1,ei);
            }
        }else if(arr[mid]<=arr[ei]){
            if(arr[mid]<tar && tar<=arr[ei]){

                return search(arr,tar,mid+1,ei);
            }else{

                return search(arr,tar,si,mid-1);
            }
        }
        return false;
    }
public static void main(String arg[]){
    int arr[]={1,0,1,1,1,1,1};
    boolean b=search1(arr,0);
    System.out.println(b);
}
}