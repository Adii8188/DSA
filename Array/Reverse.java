import java.util.*;
public class Reverse{
public static void main(String arg[]){
    int arr[]={1,2,3,4,5,6,7,8,9};
    int i=0,j=arr.length-1;
    int t=0;
    while(i<=j){
       t= arr[i];
       arr[i]=arr[j];
       arr[j]=t;
       i++;
       j--;
    }
    for(int k=0;k<arr.length;k++){
        System.out.print(arr[k]+" ");
    }
    System.out.println();
}
}