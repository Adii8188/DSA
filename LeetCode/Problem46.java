public class Problem46{
     static List<List<Integer>> list=new ArrayList<>();
    static ArrayList<Integer> li=new ArrayList<>();
    public static List<List<Integer>> permute(int[] nums) {
        permutation(nums,li,0);
        return list;
    }

    public static void permutation(int arr[],List<Integer> list1,int j){
        if(j==arr.length){
            list.add(new ArrayList<>(li));
            li.clear();
        }
        for(int i=j;i<arr.length;i++){
            list1.add(arr[i]);
            permutation(arr,list1,i+1);
        }
    }
public static void main(String arg[]){
    
    System.out.println();
}
}