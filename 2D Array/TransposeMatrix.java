public class TransposeMatrix{
    public static void trans(int mat[][]){
        int n=mat.length;
        int m=mat[0].length;
        int arr[][]=new int[m][n];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                arr[j][i]=mat[i][j];
            }
        }
        print(arr);
    }
    public static void print(int mat[][]){
        for(int i=0;i<mat.length;i++){
            System.out.print("[");
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.print("]");
        }
    }
public static void main(String arg[]){
    int mat[][]={{1,2,3},{4,5,6}};
    print(mat);
    System.out.println();
    trans(mat);
     System.out.println();
}
}