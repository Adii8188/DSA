public class FirstAccurance{
    public static int fO(int arr[],int i,int key){
        int ind=0;
        if(arr[i]==key){
            ind=i;
        }else if(i==arr.length-1){
            ind=-1;
        }else{
            ind=fO(arr,i+1,key);
        }
        return ind;
    }
    public static int lO(int arr[],int i,int key){
        int ind=0;
        if(arr[i]==key){
            ind=i;
        }else if(i==0){
            ind=-1;
        }else{
            ind=lO(arr,i-1,key);
        }
        return ind;
    }
public static void main(String arg[]){
    int arr[]={1,2,3,5,4,6,7,5,9,8};
    //int r=fO(arr,0,5);
    int r=lO(arr,arr.length-1,5);
    System.out.println(r);
    //int f=(int)("11");
    System.out.println();
}
}