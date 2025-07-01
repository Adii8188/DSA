public class SearchRotatedSortedArr{
    public static int search(int arr[],int tar,int si,int ei){
        //while(si<=ei){
        int mid=si+(ei-si)/2;
        if(arr[mid]==tar){
            System.out.println("Index of Target is :"+mid);
            return mid;
        }
        if(si>=ei){
            System.out.println("invalid record :");
            return -1;
        }
        if(arr[si]<=arr[mid]){
            if(arr[si]<=tar && tar<arr[mid]){
                ei=mid-1;
            }else{
                si=mid+1;
            }
        }else if(arr[mid]<=arr[ei]){
            if(arr[mid]<tar && tar<=arr[ei]){
                si=mid+1;
            }else{
                ei=mid-1;
            }
        }
        int i=search(arr,tar,si,ei);
        return i;
        //}
    }
public static void main(String arg[]){
    int arr[]={4,5,6,7,0,1,2};
    int arr1[]={1,3};
    int i=search(arr1,0,0,arr1.length-1);
    System.out.println(i);
}
}