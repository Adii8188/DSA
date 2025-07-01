public class StringMerge{
public static void mSort(String arr[],int si,int ei){
    int mid=si+(ei-si)/2;
    if(si>=ei){
        return;
    }
    mSort(arr,si,mid);
    mSort(arr,mid+1,ei);
    merge(arr,si,mid,ei);
}
public static void merge(String arr[],int si,int mid,int ei){
    String temp[]=new String[ei-si+1];
    int i=si;
    int j=mid+1;
    int k=0;
    while(i<=mid && j<=ei){
        if(arr[i].compareToIgnoreCase(arr[j])>0){
            temp[k]=arr[j];
            j++;
        }else{
            temp[k]=arr[i];
            i++;
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
}
public static void print(String arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
public static void main(String arg[]){
    String s[]={"sun","earth","mars","mercury"};
    mSort(s,0,s.length-1);
    print(s);
    //System.out.println("mercury".compareToIgnoreCase("mars"));
}
}