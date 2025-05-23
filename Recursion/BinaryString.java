public class BinaryString{
    public static void binString(int n,int lp,String str){
        if(n==0){
            System.out.println(str);
            return ;
        }
        if(lp==0){
            binString(n-1,0,str+"0");
            binString(n-1,1,str+"1");
        }else{
            binString(n-1,0,str+"0");
        }
    }
public static void main(String arg[]){
    int n=3;
    binString(3,0,new String(""));
    System.out.println(10%2);
}
}