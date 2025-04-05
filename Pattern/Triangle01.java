public class Triangle01{
public static void main(String arg[]){
    int a=0,n=5;
    for(int i=0;i<=n;i++){
        for(int j=0;j<i;j++){
            if(a==1 || a==0){
                if(a==1){
                  a=0;
                  System.out.print(a);
                }else{
                    a=1;
                   System.out.print(a);
                }
            }
        }
        System.out.print("\n");
    }
    //System.out.println();
}
}