import java.util.*;
public class ShortestPathDirection{
    public static void shortPath(String s){
        int l=s.length()-1;
        int x=0,y=0;
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='N'){
                y++;
            }else if(s.charAt(i)=='S'){
                y--;
            }else if(s.charAt(i)=='E'){
                x++;
            }else if(s.charAt(i)=='W'){
                x--;
            }
        }
        int x1=x*x;
        int y1=y*y;
        float sp=(float)Math.sqrt(x1+y1);
        System.out.print("SHortest Path is :"+sp);
    }
public static void main(String arg[]){
    String direction="WNEENESENNN";
    shortPath(direction);
    System.out.println();
}
}