import java.util.*;
public class Problem594{
    public static int lar(int nums[]){
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        // Count frequencies
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check for harmonious subsequences
        for (int num : nums) {
            int minNum = num;
            int maxNum = num + 1;

            if (map.containsKey(maxNum)) {
                result = Math.max(result, map.get(minNum) + map.get(maxNum));
            }
        }

        return result;
    }


    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
public static void main(String arg[]){
    int arr[]={1,3,2,2,5,2,3,7};
    int arr1[]={1,2,3,4};
    int r=lar(arr1);
    System.out.println(r);
}
}