public class Anagrams{
    public static void anagrams(String s,String t){
        char arr[]=s.toLowerCase().toCharArray();
        char arr2[]=t.toLowerCase().toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        if(Array.equlas(arr,arr2)){
            System.out.println("equlas");
        }

    }
public static void main(String arg[]){
    String s="race";
    String t="care";
    anagrams(s,t);
    System.out.println();
}
}