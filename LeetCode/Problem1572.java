public class Problem1572{
        public static int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j){
                    sum=sum+mat[i][j];
                }else if(i+j==mat.length-1){
                    sum=sum+mat[i][j];
                }
            }
        }
        System.out.print(sum);
        return sum;
    }
public static void main(String arg[]){
    int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
    diagonalSum(mat);
    System.out.println();
}
}