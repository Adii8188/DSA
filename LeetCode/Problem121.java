public class Problem121{
        public static void stock(int arr[]){
        int bp=0,max=Integer.MIN_VALUE;
        int sp=0,p=0;
        for(int i=0;i<arr.length;i++){
            if(i==0){
                bp=arr[i];
            }else{
            sp=arr[i];
            if(bp<sp){
                //bp=sp;
                p=sp-bp;
            
            }else{
                bp=sp;
            }
            }
             if(max<p){
                max=p;
            }
        }
        System.out.println("the maximum profit is :"+max);
    }
public static void main(String arg[]){
    int arr[]={7,1,5,3,6,4};
    stock(arr);
    System.out.println();
}
}