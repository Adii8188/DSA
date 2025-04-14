public class StringCompression{
    public static void compress(String s){
        int t=0;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length()-1;){
            char ch=s.charAt(i);
            int count=0;
            sb.append(ch);
            while(i<s.length() && ch==s.charAt(i)){
                    count++;
                    i++;
            }
            if(count>1){
                sb.append(count);
            }
        }
        System.out.print(sb);
    }
public static void main(String arg[]){
    String s="aaabbbcccddddee";
    compress(s);
    System.out.println();
}
}