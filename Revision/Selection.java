public class Selection{
    public static void sort(int arr[]){
        int k=0;
        for(int i=0;i<arr.length-1;i++){
            int smallest=Integer.MAX_VALUE;
            for(int j=i;j<arr.length;j++){
                if(smallest>arr[j]){
                    smallest=arr[j];
                    k=j;
                }
            }
            int temp=arr[i];
            arr[i]=smallest;
            arr[k]=temp;
        }
    }
        public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
public static void main(String arg[]){
    int arr[]={200,3,1,49,23};
    sort(arr);
    print(arr);
    System.out.println();
}
}