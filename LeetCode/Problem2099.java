import java.util.*;
public class Problem2099{
    public static int[] subsequence(int nums[],int k){
        if(k==nums.length){
            return nums;
        }
        int temp[]=Arrays.copyOf(nums,nums.length);
        Arrays.sort(temp);
        int kth=temp[temp.length-k];
        System.out.println(kth);
        int count=0;
        for(int i=temp.length-k;i<temp.length;i++){
            if(temp[i]==kth){
                count++;
            }
        }
        int result[]=new int[k];
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>kth){
                result[ind]=nums[i];
                ind=ind+1;
            }else if(nums[i]==kth && count>0){
                System.out.println(nums[i]);
                result[ind]=nums[i];
                ind=ind+1;
                count=count-1;
            }
            if(ind==k){
                break;
            }
        }
        return result;
        //print(result);
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
public static void main(String arg[]){
    int in[]={5,2,1,2,3};
    int r[]=subsequence(in,3);
    print(r);
}
}