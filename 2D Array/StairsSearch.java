public class StairsSearch{
    public static void stairsSearch(int mat[][],int key){
        int m=mat[0].length;
        int row=0,col=m-1,t=0;
        while(row < mat.length && col >= 0){
            if(key<mat[row][col]){
                col--;
            }
            else if(key>mat[row][col]){
                
                row++;
            }
            else if(key==mat[row][col]){
                System.out.print("Record Found : ["+ row +"],["+ col +"]");
                t++;
                break;
            }
        }
        if(t==0){
            System.out.print("Invalid Record !");
        }
    }
public static void main(String arg[]){
    int mat[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
    int mat1[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
    stairsSearch(mat1,20);
    System.out.println();
}
}