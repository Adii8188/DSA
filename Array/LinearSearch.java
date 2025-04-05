import java.util.*;
public class LinearSearch{
    public static void input(int arr[],Scanner sc){
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void linearS(int arr[],int n){
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("Great! we find the element .The index of the element is :"+i);
                break;
            }
        }
        if(i==arr.length){
            System.out.println("We not find your element in the aaray :");
        }
    }
public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enetr the element you store in array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    input(arr,sc);
    System.out.print("Eneter the element you want to Search :");
    int f=sc.nextInt();
    linearS(arr,f);
    System.out.println();
}
}