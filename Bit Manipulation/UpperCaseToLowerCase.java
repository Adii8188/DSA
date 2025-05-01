import java.util.*;
public class UpperCaseToLowerCase{
    public static void upToLow(char ch){
        int n=ch;
        char c=(char)(n|32);
        System.out.println(c);
    }
    // public static void arr(int arr[]){
    //     int i=0;
    //            for(int j=0;j<nums.length;j++){
    //     for(int i=0;i<nums.length-1;i++){
    //         if(nums[i]==0){
    //             int temp=nums[i];
    //             nums[i]=nums[i+1];
    //             nums[i+1]=temp;
    //         }
    //     }
    //     }
    // }
public static void main(String arg[]){
    char ch='A';
    upToLow(ch);
    int arr[]={0,1,0,3,12};
    Arrays.sort(arr);
    System.out.println();
}
}