public class ComparisionString{
    public static void com(String s[]){
        String largestS="";
        for(int i=0;i<s.length-1;i++){
            int r=s[i].compareToIgnoreCase(s[i+1]);
            if(r==0){
                continue;
            }else if(r<0){
                largestS=s[i+1];
            }else if(r>0){
                largestS=s[i];
            }
        }
        System.out.print(largestS);
    }
public static void main(String arg[]){
    String fruit[]={"mango","apple","banana","jackfruit"};
    com(fruit);
    System.out.println();
}
}