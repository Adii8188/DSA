public class FIndDuplicate{
    public static boolean duplicate(int arr[]){
        int t=0;
        boolean b=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    b=true;
                }
            }
         }
        return b;
    }
public static void main(String arg[]){
    int arr[]={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
    boolean t=duplicate(arr);
    System.out.println(t);
}
}