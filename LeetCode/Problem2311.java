import java.util.*;
public class Problem2311{
        public static int longestSubsequence(String s, int k) {
        int length=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='0'){
                length=length+1;
            }else{
                int decimal=1*(int)Math.pow(2,(s.length()-i)-1);
                if(decimal<=k){
                    k=k-decimal;
                    length=length+1;
                }
            }
        }
        return length;
    }
public static void main(String arg[]){
    String s="111100010000011101001110001111000000001011101111111110111000011111011000010101110100110110001111001001011001010011010000011111101001101000000101101001110110000111101011000101";
    int k=11713332;
    int r=longestSubsequence(s,k);
    System.out.println(r);
}
}