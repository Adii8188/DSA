public class Problem443{
        public static int compress(char[] chars) {
        StringBuilder s=new StringBuilder("");
        for(int i=0;i<chars.length;){
            char ch=chars[i];
            s.append(ch);
            int group=0;
            while(i<chars.length && ch==chars[i]){
                group++;
                i++;
            }
            if(group>1){
                s.append(group);
            }
        }
        int l=s.length();
        for(int i=0;i<s.length();i++){
            chars[i]=s.charAt(i);
        }
        System.out.print(l);
        return l;
    }
public static void main(String arg[]){
    char ch[]={'a','a','b','b','c','c','c'};
    compress(ch);
    System.out.println();
}
}