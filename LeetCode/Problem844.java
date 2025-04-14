public class Problem844{
        public static boolean backspaceCompare(String s, String t) {
        StringBuilder sb1=new StringBuilder(s);
        StringBuilder sb2=new StringBuilder(t);
        boolean b=true;
        for(int i=0;i<sb1.length();i++){
            if('#'==sb1.charAt(i)){
                sb1.deleteCharAt(i-1);
                i--;
                sb1.deleteCharAt(i);
                //i--;
               // System.out.print(sb1);
            }
        }
        System.out.print(sb1);
            for(int i=0;i<sb2.length();){
            if('#'==sb2.charAt(i)){
                sb1.deleteCharAt(i-1);
                i--;
                sb2.deleteCharAt(i);
                i--;
               // System.out.print(sb2);
            }
        }
        System.out.print(sb2);
        if(sb1==sb2){
            b=true;
        }
        return b;
        }
public static void main(String arg[]){
    String s="ab#c";
    String t="ad#c";
    boolean b=backspaceCompare(s,t);
    System.out.println(b);
}
}