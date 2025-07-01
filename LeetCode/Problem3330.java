public class Problem3330{
    public static int wordf(String word){
        int ans=1;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)==word.charAt(i-1)){
                ans=ans+1;
            }
        }
        return ans;
    }
public static void main(String arg[]){
    String word="abbcccc";
    int r=wordf(word);
    System.out.println(r);
}
}