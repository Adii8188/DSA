import java.util.*;
public class Problem2138{
    public static Vector<String> group(String s,int k,char fill){
        Vector<String> vec=new Vector<>(); 
        int i=0;String st="";
        while(i<s.length()){
            int j=i+k;
            if(j<=s.length()){
                st=s.substring(i,j);
            }else{
                st=s.substring(i);
                for(int r=1;r<(k+i)-s.length()+1;r++){
                    st+=fill;
                }
            }
                vec.add(st);
            i=j;//ctoyjrwtngqwt
        }
        return vec;
    }
public static void main(String arg[]){
    String s="abcdefghij";
    char fill='x';
    System.out.println(s.length());
    Vector<String> vec=group(s,3,fill);
    System.out.print(vec);
}
}