public class ArraySort{
    public static boolean isSorted(int arr[],int i){
        boolean b=false;
        if(i==arr.length-1){
            b=true;
        }else if(arr[i]<=arr[i+1]){
            b=isSorted(arr,i+1);
        }
        return b;
    }
public static void main(String arg[]){
    int arr[]={1,2,3,4,5};
    boolean b=isSorted(arr,0);
    System.out.println(b);
}
}