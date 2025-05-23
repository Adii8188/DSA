public class Insertion{
    public static void sort(int arr[]){
    //     for(int i=0;i<arr.length-1;i++){
    //         int temp=arr[i+1];
    //         for(int j=i;j>=0;j--){
    //             if(temp<arr[j]){      galat hai !
    //                // int k=arr[j];
    //                 arr[j+1]=arr[j];
    //             }else{
    //                 arr[j]=temp;
    //             }
    //         }
    //     }
    // }
        public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
public static void main(String arg[]){
    int arr[]={5,4,1,3,2};
    sort(arr);
    print(arr);
    System.out.println();
}
}