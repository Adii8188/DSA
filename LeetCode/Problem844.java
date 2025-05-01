public class Problem844{
        public static boolean backspaceCompare(String s, String t) {
        StringBuilder sb1=new StringBuilder(s);
        StringBuilder sb2=new StringBuilder(t);
        boolean b=true;
        for(int i=0;i<s.length();i++){
            if('#'==s.charAt(i)){
                s.replace("#","");
                s.replace(String.valueOf(s.charAt(i)),"");
        }
        System.out.print(sb1);
            for(int i=0;i<sb2.length();){
                if(sb2.charAt(i)=='#')
                t.replace("#","");
               // t.deleteCharAt(i);
            }
        }
        System.out.print(sb2);
        // if(sb1==sb2){
        //     b=true;
        // }
        return b;
        }
public static void main(String arg[]){
    String s="ab#c";
    String t="ad#c";
    boolean b=backspaceCompare(s,t);
    System.out.println(b);
}
}