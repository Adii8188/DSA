import java.util.*;
public class TripletArray{
    public static void triplet(int arr[]){
        List<List<Integer>> arr1=new ArrayList<>();
        int t=0;
        if(arr.length>=3){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        if(t>0){
                           if(arr1.get(0)==arr[i] && arr1.get(1)==arr[j] && arr1.get(2)==arr[k]){
                            continue;
                           }else{
                            //System.out.println("["+arr[i]+","+arr[j]+","+arr[k]+"]");
                            arr1.add(arr[i],arr[j],arr[k]);
                            // arr1[0]=arr[i];
                            // arr1[1]=arr[j];
                            // arr1[2]=arr[k];
                           }
                        }else{
                        t++;
                        arr1.add(arr[i],arr[j],arr[k]);
                        //System.out.println("["+arr[i]+","+arr[j]+","+arr[k]+"]");
                        // arr1[0]=arr[i];
                        // arr1[1]=arr[j];
                        // arr1[2]=arr[k];
                        }
                    // }else{
                    //  System.out.print("[]");
                    // }
                }
                
            }
            //System.out.print(arr1);
           // return arr1;
            //System.out.println("["+arr1[0]+","+arr1[1]+","+arr1[2]+"]");
        }
        }
        System.out.print(arr1);
        }else{
            System.out.print("[]");
        }
    }

public static void main(String arg[]){
    int arr[]={-1, 0,  1, 2, -1, -4};
    int arr1[]={0,1,1};
    triplet(arr1);
    System.out.println();
}
}