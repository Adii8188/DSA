public class Dublicate{
    static boolean map[]=new boolean[26];
    static StringBuilder sb=new StringBuilder("");
    public static void dup(String s,int ind){
        if(ind==s.length()){
            System.out.println(sb);
            return ;
        }
        int index=s.charAt(ind)-'a';
        if(map[index]==false){
            sb.append(s.charAt(ind));
            map[index]=true;
        }
        dup(s,ind+1);
    }

public static void main(String arg[]){
    String str="appnnacollege";
    dup(str,0);
    System.out.println();
}
}