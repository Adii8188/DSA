public class Permutation{
    static int i=0;
    public static void permutation(String str,String ans){
        if(str.equals("")){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            String ch=String.valueOf(str.charAt(i));
            permutation(str.replace(ch,""),ans+str.charAt(i));
        }
    }
public static void main(String arg[]){
    String s="abc";
    permutation(s,"");
    System.out.println();
}
}