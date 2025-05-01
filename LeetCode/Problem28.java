public class Problem28{
        public static int strStr(String haystack, String needle) {
        int i=0,t=-1;
        while(i<=haystack.length()-needle.length()){
            if((haystack.substring(i,i+needle.length()).equals(needle))){
                t=i;
                break;
            }else{
                i++;
            }
        }
        return t;
    }
        public static String shortestPalindrome(String s) {
        int t=0;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));
            StringBuilder sb1=new StringBuilder(s.substring(0,i+1)).reverse();
            if(sb.toString().equals(sb1.toString())){
                System.out.println(sb1);
                    t=i+1;
            }
        }
        StringBuilder sb3=new StringBuilder(sb.substring(t,sb.length()));


        String ss=new String(sb3.reverse().toString());
        sb.insert(0,ss);
        System.out.println(sb);
        ss=sb.toString();
        return ss;
    }

        public static boolean repeatedSubstringPattern(String s) {
        boolean b=false;
        for(int i=0;i<=s.length()/2;i++){
            String ss=s.substring(0,i+1);
            StringBuilder sb1=new StringBuilder("");
            while(sb1.length()<s.length()){
                sb1.append(ss);
            } 
            System.out.println(sb1);
            if(sb1.toString().equals(s)){
                b=true;
                break;
            }
        }
        return b;
        }

    public static String str(String s){
        String sb = "";
       int left = s.length() - 1;
       int right = 0;

     while (right <= left) {
     if (s.charAt(right) == s.charAt(left)) {
        right++;
    } else {
        sb += s.charAt(left);
    }
    left--;
    }
        s = sb+s ;
        return s ;
    }
public static void main(String arg[]){
    // String s="sadbutsad";
    // String t="sad";
    // int r=strStr(s,t);
    // System.out.println(r);
    String ss="aacecaaa";
    ss=str(ss);
    System.out.println(ss);

    // boolean b=repeatedSubstringPattern("abcabcabc") ;
    // System.out.println(b);   
}
}