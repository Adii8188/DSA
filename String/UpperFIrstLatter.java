public class UpperFIrstLatter{
    public static void upper(String sb){
        StringBuilder sbb=new StringBuilder("");
        char ch;
        ch=sb.charAt(0);
        ch=Character.toUpperCase(ch);
        sbb.append(ch);
        for(int i=1;i<=sb.length()-1;i++){
            if(sb.charAt(i)==' ' || sb.charAt(i)==','){
                sbb.append(sb.charAt(i));
                i++;
                ch=Character.toUpperCase(sb.charAt(i));
                sbb.append(ch);
            }else{
                sbb.append(sb.charAt(i));
            }
        }
         System.out.println(sbb);
    }
public static void main(String arg[]){
    String sb=new String("hi i am adityi");
    String arr[]=sb.split(" ");
    System.out.print(arr[0].length());
    // StringBuilder sb1=new StringBuilder("hello shweta i am rimya");
    // upper(sb);
    // System.out.println();
}
}