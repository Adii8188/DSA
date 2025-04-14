public class Problem125{
        public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int l=s.length();
        boolean b=true;
        for(int i=0;i<l/2;i++){
            if(s.charAt(i)!=s.charAt(l-1-i)){
                b=false;
                break;
                }
                }
        return b;
    }
public static void main(String arg[]){
    String s="A man, a plan, a canal: Panama";
    boolean b=isPalindrome(s);
    System.out.println(b);
}
}