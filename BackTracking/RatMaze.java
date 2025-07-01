public class RatMaze{
    static int rr=0;
    public static void rat(int arr[][],int r,int c){
        if(r==arr.length-1 && c==arr[0].length-1){
           // System.out.println(sb);
            rr=rr+1;
            //print(arr);
            //ystem.out.println(r);
            return ;
        }
        if(r<0 || c<0 || r>=arr.length || c>=arr[0].length  || arr[r][c]==0){
            return;
        }

        arr[r][c]=0;
       // sb.append('L');
        rat(arr,r,c-1);
       // sb.deleteCharAt(sb.length()-1);

       // sb.append('U');
        rat(arr,r-1,c);
        //sb.deleteCharAt(sb.length()-1);
        
       // sb.append('D');
        rat(arr,r+1,c);
        //sb.deleteCharAt(sb.length()-1);

       // sb.append('R');
        rat(arr,r,c+1);
        //sb.deleteCharAt(sb.length()-1);

        arr[r][c]=1;
    }
    public static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
           static  int count=0;
         public static int ratWays(int[][] maze, int row, int col) {
       int N = maze.length;
        if (row == N-1  && col == N -1) {
            
            //count=count+1;
          // print(maze);
            return 1;
        }

       
        if (row < 0  ||  col < 0 || row >= N  || col >= N  || maze[row][col] == 0) {
            return 0;
        }
 
        maze[row][col] = 0;


        // Move Down
       
        count = ratWays(maze, row + 1, col);

        // Move Right
        count = ratWays(maze, row, col + 1);

        // Move Up
        count = ratWays(maze, row - 1, col);

        // Move Left
        count = ratWays(maze, row, col - 1);

       
        maze[row][col] = 1;

        return count;
    }
public static void main(String arg[]){
    int arr[][]={{1,0,0,0},
    {1,1,0,0},
    {0,1,0,0},
    {1,1,1,1}};
    //int rw=ratWays(arr,0,0);
    rat(arr,0,0);
    System.out.println(rr);
}
}