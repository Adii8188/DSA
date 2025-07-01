public class ArrayBt{
    public static void back(int arr[],int i,int j){
        if(i==arr.length){
           // arr[i]=j-2;
            return;
        }
        arr[i]=j;
        back(arr,i+1,j+1);
        arr[i]=j-2;//backtracking step jo ki humesha funtion call ke bad hi hota hai .
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
public static void main(String arg[]){
    int arr[]=new int[5];
    back(arr,0,1);
    print(arr);
    System.out.println();
}
}