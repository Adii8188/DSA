public class SubSring{
    public static void subString(String s,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr=substr+s.charAt(i);
        }
        System.out.print(substr);
    }
public static void main(String arg[]){
    String s="helloWorld";
    subString(s,0,5);
    System.out.println();
}
}