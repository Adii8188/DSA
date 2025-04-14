import java.util.*;
public class Problem54{
        public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int j=top;j<=bottom;j++){
                list.add(matrix[j][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int j=bottom;j>=top;j--){
                    list.add(matrix[j][left]);
                }
                left++;
            }
        }
        return list;
    }
public static void main(String arg[]){
    int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
    List<Integer> list=spiralOrder(matrix);
    System.out.println(list);
}
}
