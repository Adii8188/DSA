public class prefix{
    public static void prefixSum(int arr[]){
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(i==0){
                    cs=prefix[j];
                }else{
                    cs=prefix[j]-prefix[i-1];
                }
                if(ms<cs){
                    ms=cs;
                }
            }
        }
        System.out.println("max Sum is :"+ms);
    }


public static void main(String arg[]){
    int arr[]={1,-2,6,-1,3};
    prefixSum(arr);
    System.out.println(Math.max(-1,-48));
}
}
int cs = 1 ;
        int t = 1 ;
        int mx = Integer.MIN_VALUE ;
        for( int i = 0  ;  i< nums.length ; i++){
            cs = 1 ;
            t  = 1 ;
        
          //  cs = cs * nums[i] ;
            for( int  j = i ; j < nums.length ;j++){

            
            if( cs <= 0){
                cs = nums[j] ;
            }else{
                t = t * nums[j] ;
            }
            
            mx = Math.max( mx , cs*t ) ;
            }
    }
        return mx ;
    }
}
 