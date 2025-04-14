public class Practice1{
    public static void vowelFind(String s){
        int t=0;
        for(int i=0;i<s.length();i++){
           char ch= s.charAt(i);
           
           if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                t++;
           }
        }
        System.out.print(t);
    }
public static void main(String arg[]){
    String st="AdityiAgrahari";
    vowelFind(st);
    System.out.println();
}
}