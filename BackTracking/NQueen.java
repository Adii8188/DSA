import java.util.*;
public class NQueen{
    static int count=0;
    public static boolean queen(char ch[][],int r){
        if(r==ch.length){
                count++;
                return true;
            }
            for(int j=0;j<ch[0].length;j++){
                boolean b=isSafe(ch,r,j);
                if(b==true){
                    ch[r][j]='Q';
                    boolean bb=queen(ch,r+1);
                   if(bb==true){
                    return true;
                   }else{
                    ch[r][j]='x';
                   }
            }
    }
    return false;
    }
    public static boolean isSafe(char ch[][],int row, int col){
        for(int i=row-1;i>=0;i--){
            if(ch[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(ch[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<ch.length;i--,j++){
            if(ch[i][j]=='Q'){
                return false;
            }
        }
        return true;
        }
    public static void print(char mat[][]){
        System.out.println("--------checse board---------");
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
public static void main(String arg[]){
    char ch[][]=new char[4][4];
    for(int i=0;i<ch.length;i++){
        for(int j=0;j<ch[0].length;j++){
            ch[i][j]='x';
        }
    }
   boolean b= queen(ch,0);
    System.out.println(count);
    System.out.println(b);
}
}