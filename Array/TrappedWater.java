public class TrappedWater{
    public static void msl(int arr[],int arrl[]){
        int msl=Integer.MIN_VALUE,csl;
        for(int i=0;i<arrl.length;i++){
            if(arr.length>2){
            if(i==0){
                arrl[i]=arr[i];
                msl=arrl[i];
            }else{
                csl=arr[i];
                if(msl<csl){
                    msl=arr[i];
                }
                arrl[i]=msl;
            }
            //System.out.println(arrl[i]);
        }
        }
    }
    public static void msr(int arr[],int arrR[]){
        int msr=Integer.MIN_VALUE,csr;
        if(arr.length>2){
        for(int i=0;i<arrR.length;i++){
            for(int j=arrR.length-1;j>=i;j--){
                csr=arr[j];
                if(msr<csr){
                    msr=csr;
                }
            }
            //System.out.print(msr);
            arrR[i]=msr;
            msr=Integer.MIN_VALUE;
        }
        }
    }
    public static void trappedWater(int arr[],int r[],int l[]){
      int min,tr=0;
      if(arr.length>2){
      for(int i=0;i<arr.length;i++){
        if(l[i]<r[i]){
            min=l[i];
        }else{
            min=r[i];
        }
        tr=tr+(min-arr[i]);
      } 
      System.out.println("the amount of water trapped in bars is:"+tr); 
      }
    }
public static void main(String arg[]){
    int arr[]={4,2,0,6,3,2,5};
    int r[]=new int[arr.length];
    int l[]=new int[arr.length];
    msl(arr,l);
    msr(arr,r);
    trappedWater(arr,r,l);
    System.out.println();
}
}