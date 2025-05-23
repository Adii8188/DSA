public class Counting{

    public static void sort(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int t=0;
        for(int i=0;i<count.length;i++){
            for(int j=count[i];j>0;j--){
                arr[t]=i;
                t++;
            }
        }
        print(arr);
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
public static void main(String arg[]){
    int arr[]={1,4,1,3,2,4,3,7};
    sort(arr);
    System.out.println();
}
}