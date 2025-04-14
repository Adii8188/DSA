public class SelectionSort{
    public static void SSort(int arr[]){
        int temp,t=0,min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
           // min=Integer.MAX_VALUE;
             t=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[t]>arr[j]){
                    t=j;
                }
            }
            temp=arr[t];
            arr[t]=arr[i];
            arr[i]=temp;
        }
        print(arr);
    }
    public static void SSortDes(int arr[]){
        int t=0;
        for(int i=0;i<arr.length-1;i++){
            t=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[t]<arr[j]){
                    t=j;
                }
            }
            int temp=arr[t];
            arr[t]=arr[i];
            arr[i]=temp;
        }
        print(arr);
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
public static void main(String arg[]){
    int arr[]={5,4,1,3,2};
    int arr1[]={3,6,2,1,8,7,4,5,3,1};
    SSort(arr);
    System.out.println();
    SSortDes(arr1);
}
}