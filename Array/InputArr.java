import java.util.*;
public class InputArr{
public static void main(String arg[]){
    int arr[]=new int[5];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        System.out.println("value of array["+i+"] :"+arr[i]);
    }
    
    // arr[0]=sc.nextInt();
    // arr[1]=sc.nextInt();
    // arr[2]=sc.nextInt();
    // arr[3]=sc.nextInt();
    
    // System.out.println("Value:"+arr[0]);
    // System.out.println("Value:"+arr[1]);
    // System.out.println("Value:"+arr[2]);
    // System.out.println("Value:"+arr[3]);

    // System.out.println("length of array "+arr.length);

    // arr[3]=arr[3]+1;
    // System.out.println("Modified Value:"+arr[3]);
}
}