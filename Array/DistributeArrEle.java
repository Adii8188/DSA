import java.util.*;
public class DistributeArrEle{
    public static int[] dis(int nums[]){
        Vector<Integer> arr1=new Vector<>();
        Vector<Integer> arr2=new Vector<>();
        int arr[]=new int[nums.length];
        int t=0,t1=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                arr1.add(nums[i]);
                //t++;
            }
        }
        print(arr1);
        for(int i=0;i<nums.length;i++){
            if(i%2!=0){
                arr2.add(nums[i]);
                //t1++;
            }
        }
        
       print(arr2);
        for(int i=0;i<nums.length;i++){
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)){
                arr1.set(arr1.size()-1,nums[nums.length-1]);
            }else{
                arr2.set(arr2.size()-1,nums[nums.length-1]);
            }
            if(i<arr1.size()){
                arr[i]=arr1.get(i);
                t++;
            }else{
                arr[i]=arr2.get(i-t);
            }
        }
        //print(arr);
        return arr;
    }
    public static void print(Vector<Integer> vec){
        System.out.print("[");
        for(int i=0;i<vec.size();i++){
            System.out.print(vec.get(i)+" ");
        }
        System.out.print("]");
    }
    public static void print(int arr[]){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
public static void main(String arg[]){
    int arr[]={2,1,3};
    int arr1[]={5,4,3,8};
    int arr2[]={1,2,4};
    int result[]=dis(arr2);
    print(result);
    //dis(arr);

    System.out.println();
}
}