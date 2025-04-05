import java.util.*;
//import DSA.Array.*;
public class LargestNumber{
        public static void input(int arr[],Scanner sc){
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void large(int arr[]){
        int key=0,temp=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>temp){
                //key=i+1;
                temp=arr[i];
            }else{
                 key =arr[i];
            }
        }
        System.out.println("The Largest number in the array is:"+temp);
        System.out.println("The Largest number in the array is:"+key);
    }
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Eneter the number of element you want to store:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    input(arr,sc);
    large(arr);
    System.out.println();
}
}