public class Problem2014{
    static String st="";
    static int k=0;
    public static void subsequence(String s,int k){
        int ch[]=new int[26];
        String sb=new String("");
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            ch[c-96]++;
        } 
        for(int i=0;i<ch.length;i++){
            if(ch[i]>=k){
                char cc=(char)(i+96);
                sb+=cc;
            }
        }
        permutation(sb,"");
        System.out.println(sb);
       // print(ch);
    }
        public static void permutation(String str,String ans){
        if(str.equals("")){
            int i=0;
            int j=0;
            while(j<ans.length()*k && i<st.length()){
                if(st.charAt(i)==ans.charAt(j%k)){
                    j++;
                }else{
                    i++;
                }
            }
            if(j==ans.length()*k){
                System.out.println(ans);
            }
            return;
        }
        for(int i=0;i<str.length();i++){
            String ch=String.valueOf(str.charAt(i));
            permutation(str.replace(ch,""),ans+str.charAt(i));
        }
    }
    public static void print(int ch[]){
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]+" ");
        }
    }
public static void main(String arg[]){
    String s="letsleetcode";
    st=s;k=2;
    subsequence(s,2);
    System.out.println();
}
}