public class FindCountOfNumber{
    public static void find(int mat[][],int key){
        int t=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(key==mat[i][j]){
                    t++;
                }
            }
        }
        System.out.print("the number is arrive : "+t+ " times!");
    }

    public static void sumOfNumOfRow(int mat[][],int row){
        int sum=0;
        for(int i=0;i<mat[0].length;i++){
            sum=sum+mat[row-1][i];
        }
        System.out.print(sum);
    }
public static void main(String arg[]){
    int arr[][]={{4,7,8},{8,8,7}};
    find(arr,7);
    System.out.println();
    int[][] nums = {{1,4,9},{11,4,3},{2,2,3}};
    sumOfNumOfRow(nums,2) ;
    
}
}