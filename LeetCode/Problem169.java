import java.util.*;
public class Problem169{
    public static int majorty1( int arr[], int ans, int i  ){
           Arrays.sort(arr);
          if(arr[i] < arr.length/2 ){
            ans = arr[i];
            print(arr);
             return ans ;
         }
            
         majorty1(arr, ans, i+1);
         return -1 ;
      }
      public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
      }
public static void main(String arg[]){
    int arr[]={2,2,1,1,1,2,2};
   int i= majorty1(arr,0,0);
    System.out.println(i);
}
}