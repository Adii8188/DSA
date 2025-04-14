public class CountingSort{
    public static void counting(int arr[]){
        int t=0,max=0;
            for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int arr1[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            arr1[arr[i]]++;
        }
        print(arr1);
        System.out.println();
        int tt=arr.length-1,i=0;
        while(i<arr1.length){
            int j=arr1[i];
            while(j>0){
                arr[tt]=i;
                tt--;
                j--;
                //System.out.print(i);
            }
            i++;
        }
        print(arr);
    }
    // public static void counting(int arr[]){
    //     int max=0;
    //     for(int i=0;i<arr.length;i++){
    //         if(max<arr[i]){
    //             max=arr[i];
    //         }
    //     }
    //     System.out.print(max);
    //     int count[]=new int
    // }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
public static void main(String arg[]){
    int arr[]={1,4,1,3,2,4,3,7};
    int arr1[]={4, 2, 2, 8, 3, 3, 1};
    counting(arr1);
    System.out.println();
}
}