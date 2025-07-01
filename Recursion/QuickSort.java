public class QuickSort{
    public static void quick(int arr[],int si,int ei){
        int pivot=arr[arr.length-1];
        if(si>=ei){
            return;
        }
        int i=partition(arr,si,ei);
        //int mid=si+(ei-si)/2;
        quick(arr,si,i-1);
        quick(arr,i+1,ei);

    }
    public static int partition(int arr[],int si,int ei){
        int i=si-1;
        int j=si;
        int p=arr[ei];
        while(j<ei){
            if(arr[j]<p){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
            j++;
        }
        i++;
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
         //print(arr);
        System.out.println(i);
        return i;
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
public static void main(String arg[]){
    int arr[]={6,3,9,8,2,5,10,4};
    quick(arr,0,arr.length-1);
    System.out.println();
    print(arr);
}
}