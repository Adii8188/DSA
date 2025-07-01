public class Sudoko{
    public static boolean sudoku(int arr[][],int r,int c){
        if(r==9){
            return true;
        }
        int nextrow=r;
        int nextcol=c+1;
        if(c+1==9){
            nextrow=r+1;
            nextcol=0;
        }
        if(arr[r][c]!=0){
            return sudoku(arr,nextrow,nextcol);
        }
        for(int i=1;i<10;i++){
            if(isSafe(arr,r,c,i)){
                arr[r][c]=i;
                 if(sudoku(arr,nextrow,nextcol)){
                    return true;
                 }
                arr[r][c]=0;
            }
        }
        return false;
    }

    public static boolean isSafe(int arr[][],int r,int c,int v){
        for(int i=0;i<arr.length;i++){
            if(arr[i][c]==v){
                return false;
            }
        }
        for(int i=0;i<arr[0].length;i++){
            if(arr[r][i]==v){
                return false;
            }
        }
        int sr=(r/3)*3;
        int sc=(c/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(arr[i][j]==v){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean grid(int arr[][],int sr,int sc,int v){
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(arr[i][j]==v){
                    return false;
                }
            }
        }
        return true;
    }

    public static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
public static void main(String arg[]){
    int arr[][]={{0,0,8,0,0,0,0,0,0},
    {4,9,0,1,5,7,0,0,2},
    {0,0,3,0,0,4,1,9,0},
    {1,8,5,0,6,0,0,2,0},
    {0,0,0,0,2,0,0,6,0},
    {9,6,0,4,0,5,3,0,0},
    {0,3,0,0,7,2,0,0,4},
    {0,4,9,0,3,0,0,5,7},
    {8,2,7,0,0,9,0,1,3}};
    boolean b=sudoku(arr,0,0);
    System.out.println(b);
    print(arr);
}
}