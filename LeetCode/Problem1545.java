public class Problem1545{
    // public static void kthBit(int n,int i){
    //     String Si="0";
    //     STring Si = Si - 1 + "1" + reverse(invert(Si - 1));
    // }
        public static int lengthOfLastWord(String s) {
         String[] words = s.split(" ");
         int l=words[words.length-1].length();
         System.out.println(l);
         return l;
    }
public static void main(String arg[]){
     String s="hellow World";
     lengthOfLastWord(s);
    System.out.println();
}
}