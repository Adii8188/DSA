public class FindIndex{
    public static void target(int arr[],int key,int ind){
        if(key==arr[ind]){
            System.out.print(ind+" ");
        }
        if(ind==arr.length-1){
            return;
        }
        target(arr,key,ind+1);
    }
    public static void Stringlength(String s,int ind){
        if(ind==s.length()){
            System.out.println(ind);
            return;
        }
        Stringlength(s,ind+1);
    }


public static void main(String arg[]){
    int arr[]={3,2,4,5,6,2,7,2,2};
    //occuArray(2,arr,0);
    String s="rimya";
    Stringlength(s,0);
    System.out.println();
}
}