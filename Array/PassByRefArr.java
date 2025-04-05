import java.util.*;
public class PassByRefArr{
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void input(int arr[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
public static void main(String arg[]){
    int marks[]=new int[5];
    input(marks);
    update(marks);
    printarr(marks);
    System.out.println();
}
}