public class InversionCount{
    static int t=0;
    public static int inversion(int arr[],int si,int ei){
        // if(i>arr.length-1){
        //     System.out.print(t);
        //     return ;
        // }
        //     if(j>=arr.length){
        //         i=i+1;
        //         j=i+1;
        //         inversion(arr,i,j);
        //         return ;
        //     }
        //     if(arr[i]>arr[j]){
        //         t++;
        //     }
        //     inversion(arr,i,j+1);

        int mid=si+(ei-si)/2;
        if(si>=ei){
            return t;
        }
        inversion(arr,si,mid);
        inversion(arr,mid+1,ei);
        t=t+count(arr,si,mid,ei);
        return t;
    }
    public static int count(int arr[],int si,int mid,int ei){
        int  temp[]=new int[ei-si+1];int count=0;
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]>arr[j]){
                //temp[k]=arr[j];
                j++;
                count=(mid-i)+1;
            }else{
                //temp[k]=arr[i];
                i++;
            }
            k++;
        }
        // while(i<=mid){
        //     temp[k++]=arr[i++];
        // }
        // while(j<=ei){
        //     temp[k++]=arr[j++];
        // }
        // for(k=0,i=si;k<temp.length;k++,i++){
        //     arr[i]=temp[k];
        // } 
        return count;
    }
public static void main(String arg[]){
    int arr[]={2,4,1,3,5};
    int arr1[]={5,8,2,1,10};
    int ans=inversion(arr,0,arr.length-1);
    System.out.println(ans);
}
}