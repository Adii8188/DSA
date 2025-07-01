import java.util.*;
public class MajorityElement{
    public static int majority(int arr[],int si,int ei){
        Arrays.sort(arr);
        int pivot=arr[0];
        int i=0,t=0;
        while(i<arr.length){
            if(t>arr.length/2){
                return pivot;
            }
            if(pivot==arr[i]){
                t++;
            }else{
                    pivot=arr[i];
                    t=0;
            }
            i++;
        }
        return pivot;
    }
    public static int count(int arr[],int si,int ei){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int arr1[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            arr1[arr[i]]++;
        }
        int i=0;
        while(i<arr1.length){
            if(arr1[i]>=arr.length/2){
                return i;
                //break;
            }
            i++;
        }
        //print(arr1);
        return -1;

    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
public static void main(String arg[]){
    int arr[]={2,2,1,1,1,2,2,3,3,3,3,3,3};
    int arr1[]={3,2,3,3,4};
    int t=count(arr,0,arr.length-1);
    //System.out.println();
    System.out.println(t);
}
}