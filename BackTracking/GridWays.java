import java.util.*;
public class GridWays{
    public static int grid(int x,int y,int arr[][]){
        if(x==arr.length-1 && y==arr[0].length-1){
            return 1;
        }
        if(x==arr.length || y==arr[0].length){
            return 0;
        }
        return grid(x+1,y,arr)+grid(x,y+1,arr);
    }
    
public static void main(String arg[]){
    int n[][]=new int[4][5];
    int r=grid(0,0,n);
    System.out.println(r);
}
}