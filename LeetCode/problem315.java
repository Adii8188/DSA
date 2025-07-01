import java.util.*;
public class problem315{
    static int tt=0;
   static ArrayList<Integer> list=new ArrayList<>();
        public static void mSort(int si,int ei,int arr[]){
        int mid=si+(ei-si)/2;
        if(si>=ei){
            //list.add(t);
            return ;
        }
        mSort(si,mid,arr);
        mSort(mid+1,ei,arr);
        tt=merge(arr,si,mid,ei);
        list.add(tt);
    }
    public static int merge(int arr[],int si,int mid,int ei){
        int t=0;
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                
            }else{
                temp[k]=arr[j];
                t++;
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
        return t;
    }
public static void main(String arg[]){
    int arr[]={5,2,6,1};
    mSort(0,arr.length-1,arr);
    System.out.println(list);
}
}