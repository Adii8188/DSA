import java.util.*;
public class Smallest{
        public static void input(int arr[],Scanner sc){
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void small(int arr[]){
        int key=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<key){
                key=arr[i];
            }
        }
        System.out.println("Smallest number is:"+key);
    }
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    input(arr,sc);
    small(arr);
    System.out.println();
}
}