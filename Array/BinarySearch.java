import java.util.*;
public class BinarySearch{
    public static void  binSearch(int arr[],int key){
        int mid=0,start=0,end=arr.length,t=-1;
        mid=(start+end)/2;
        while(start<end){
            mid=(start+end)/2;
            //t++;
            //System.out.println(mid);
            if(key>arr[mid]){
                 start=mid+1;
            }else if(key==arr[mid]){
                t=0;
                System.out.println("found the element at index:"+mid);
                break;
            }else{
                 end =mid-1;
            }
        }
        if(t!=0){
            System.out.println("your element not in the aaray :");
        }
    }
public static void main(String arg[]){
    int arr[]=new int[8];
    int arr1[]={4,5,6,7,0,1,2};
    Scanner sc=new Scanner(System.in);
    // for(int i=0;i<arr.length;i++){
    //     arr[i]=sc.nextInt();
    // }
    binSearch(arr1,1);
    System.out.println();
}
}