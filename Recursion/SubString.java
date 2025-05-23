public class SubString{
    static StringBuilder sb=new StringBuilder("");
    static int t=0;
public static void sub(String s,StringBuilder sb,int stind,int curind){

    if(curind==s.length()){
        if(stind==s.length()-1){
        return ;
    }else{
        stind=stind+1;
        curind=stind;
        sb=new StringBuilder("");
    }
    }
    sb.append(s.charAt(curind));
    if(s.charAt(stind)==s.charAt(curind)){
        t++;
        System.out.print(sb+" ");
    }
    sub(s,sb,stind,curind+1);
}

    
public static void main(String arg[]){
    String s="abca";
    sub(s,sb,0,0);
    System.out.println();
    System.out.println(t);
   //subStringSameSt(0,s,0);
}

static StringBuilder sbb = new StringBuilder();
   public static void subStringSameSt(int st , String  str , int st1 ){
    
    if( st == str.length()){
        System.out.println(">>>>>>>");
        System.out.println(sb);
        return ;
    }
    subStringSameSt(st, str, st1+1);
    if(str.charAt(st) == str.charAt(st1)){
      sb.append(str+" ");
           st1 =st1+1;
      
    }
    subStringSameSt(st+1, str, st1);
   }
}