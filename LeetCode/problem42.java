public class problem42{
    public static int trappedWater(int height[]){
       int msl=Integer.MIN_VALUE,msr=Integer.MIN_VALUE;
       int csr=0,csl=0,min=0,tr=0;
       int l[]=new int[height.length] ;
       int r[]=new int[height.length];
       if(height.length>2){
       for(int i=0;i<l.length;i++){
            if(i==0){
                l[i]=height[i];
                msl=l[i];
            }else{
                csl=height[i];
                if(msl<csl){
                    msl=csl;
                }
                l[i]=msl;
            }
       }
       for(int i=0;i<r.length;i++){
        for(int j=r.length-1;j>=i;j--){
            csr=height[j];
            if(msr<csr){
                msr=csr;
            }
        }
        r[i]=msr;
        msr=Integer.MIN_VALUE;
       }
       for(int i=0;i<height.length;i++){
            if(l[i]<r[i]){
                min=l[i];
            }else{
                min=r[i];
            }
            tr=tr+(min-height[i]);
       }
       }
        return tr;
    }
public static void main(String arg[]){
    int height[]={4,2,0,3,2,5};
    int tr=trappedWater(height);
    System.out.println(tr);
}
}