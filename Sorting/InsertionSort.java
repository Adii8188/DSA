import java.util.*;
public class InsertionSort{
    public static void insertionSort(int arr[]){
        int j=1,temp=0,i=0;
        while(j<arr.length){
            i=j-1;temp=arr[j];
            while(i>=0 && temp<arr[i]){
                    arr[i+1]=arr[i];
                    i--;
            }
            arr[i+1]=temp;
            j++;
            }
            print(arr);
        }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
       public static void print(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
public static void main(String arg[]){
    Integer arr[]={5,4,1,3,2};
    //Arrays.sort(arr,0,3);
    Arrays.sort(arr,Collections.reverseOrder());
    print(arr);
    //insertionSort(arr);
    System.out.println();
}
}