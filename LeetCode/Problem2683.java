public class Problem2683{
        public static boolean doesValidArrayExist(int[] derived) {
        int t=0;
        for(int i=0;i<derived.length;i++){
                t=t^derived[i];
        }
        if(t==0){
            return true;
        }else{
            return false;
        }
    }
public static void main(String arg[]){
    int arr[]={1,1,0};
    boolean b=doesValidArrayExist(arr);
    System.out.println(b);
}
}