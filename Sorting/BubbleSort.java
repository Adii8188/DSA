public class BubbleSort{
    public static void bSort(int arr[]){
        int temp;
        for(int i=0;i<=arr.length-2;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>=arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        print(arr);
    }
    public static void bSortDes(int arr[]){
        for(int i=0;i<arr.length-2;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<=arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
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
    int arr[]={50,4,1,3,2,8,10,80};
    int arr1[]={3,6,2,1,8,7,4,5,3,1};
    bSortDes(arr1);
    System.out.println();
}
}