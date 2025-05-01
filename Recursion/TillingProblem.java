public class TillingProblem{
    public static int tile(int n){
        if(n==0 || n==1){
            return 1;
        }
        int h=tile(n-2);
        int v=tile(n-1);
        return h+v;
    }
public static void main(String arg[]){
    int n=5;
     int r=tile(n);
    System.out.println(r);
}
}