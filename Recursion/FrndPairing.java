public class FrndPairing{
    public static int pair(int n){
        if(n==1 || n==2){
            return n;
        }
        int s=pair(n-1);
        int p=(n-1)*pair(n-2);
        return (s+p);
    }
public static void main(String arg[]){
    int n=4;
    int r=pair(n);
    System.out.println(r);
}
}