public class RotateAtIndex{
    public static int rotate(int arr[],int pivot,int tar){
        int arr1[]=new int[arr.length];
        int t=0,ind=-1;
        for(int i=pivot;i<arr.length;i++){
            arr1[t]=arr[i];
            //System.out.print(arr1[t]);
            t=t+1;
        }
        for(int i=0;i<pivot;i++){
            arr1[t]=arr[i];
            //System.out.println(arr1[t]);
            t++;
        }
        System.out.print("{");
        for(int i=0;i<arr.length;i++){
            if(arr1[i]==tar){
                 ind=i;
            }
            System.out.print(arr1[i]+" ");
        }
        System.out.println("}");
        return ind;
        //print(arr1);
    }
public static void main(String arg[]){
    int arr[]={0,1,2,4,5,6,7};
    int arr1[]={1};
    int pivot=0,target=0;
    int tindex=rotate(arr1,pivot,target);
    System.out.println("The index of the target is:"+tindex);
}
}