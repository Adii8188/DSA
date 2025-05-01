public class SubArray{
public static void main(String arg[]){
    int arr[]={1,2,3,4,6};
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            System.out.print("{");
            for(int k=i;k<=j;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.print("}");
        }
        System.out.println();
    }
    System.out.println();
}
}