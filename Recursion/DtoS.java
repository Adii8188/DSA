public class DtoS{
   static  StringBuilder sb=new StringBuilder("");
   //static int t1=0;
    // public static void convert(int n,StringBuilder sb,int nn,int l){
    //     t1=l;
    //     int t=n%10;
    //     if(l==nn){
    //         System.out.println(sb);
    //         return ;
    //     }
    //     switch(t){
    //         case 0:
    //             sb.append("Zero ");
    //             break;
    //         case 1:
    //             sb.append("one ");
    //             break;
    //         case 2:
    //             sb.append("two ");
    //             break;
    //         case 3:
    //             sb.append("three ");
    //             break;
    //         case 4:
    //             sb.append("four ");
    //             break;
    //         case 5:
    //             sb.append("five ");
    //             break;
    //         case 6:
    //             sb.append("six ");
    //             break;
    //         case 7:
    //             sb.append("seven ");
    //             break;
    //         case 8:
    //             sb.append("eight ");
    //             break;
    //         case 9:
    //             sb.append("nine ");
    //             break;
    //         default :
    //         System.out.println("invalid Digit :");
    //         return ;
    //     }
    //     n=n/10;
    //     convert(n,sb,nn+1,t1);
    // }
public static void main(String arg[]){
    int n=17756;
    // String s=String.valueOf(n);
    // convert(n,sb,0,s.length());
    dtos(n);
    //System.out.println(s.length());
}

public static void dtos(int n){
    String word[]={"zeor","one","two","three","four","five","six","seven","eight","nine"};
    if(n==0){
        return ;
    }
    dtos(n/10);
    System.out.print(word[n%10]+" ");
}
}