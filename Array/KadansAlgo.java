public class KadansAlgo{
    public static void kadansAlgo(int arr[]){
        int cs=0,ms=Integer.MIN_VALUE;
        int t=0,t1=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=0){
                t=t+arr[i];
            }else{
                t1=0;
            }
        }
        for(int i=0;i<arr.length;i++){
            //cs=cs+arr[i];
            if(t<=0 && t1==0){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;// for special condition jab sare element neagtive honge to cs ki value 0 nhi krni hai ;
            }
            if(ms<cs){
                ms=cs;
            }
            }else{
                cs=arr[i];
                if(ms<cs){
                ms=cs;
            }
            }
        }
        System.out.println("the maximun value of the subarray is:"+ms);
    }
public static void main(String arg[]){
    int arr[]={-2,-3,4,-1,-2,1,5,-3};
    int arr1[]={-2,-3,-1,-2,-3};
    int arr2[]={5,4,-1,7,8};
    int arr3[]={-2,1,-3,4,-1,2,1,-5,4};
    int arr4[]={1,2};
    kadansAlgo(arr4);
    System.out.println();
}
}