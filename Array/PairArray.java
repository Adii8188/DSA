public class PairArray{
public static void main(String arg[]){
   int  arr[]={2,4,6,8,10,40,30};
   int t=0;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            System.out.print("("+arr[i]+","+arr[j]+") ");
            t++;
        }
        System.out.println();
    }
    System.out.println(t);
}
}