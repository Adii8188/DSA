public class FloydsTriangle{
public static void main(String arg[]){
    int a=1,n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(a+" ");
            a++;
        }
        System.out.print("\n");
    }
    //System.out.println();
}
}