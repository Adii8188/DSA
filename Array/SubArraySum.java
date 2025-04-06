public class SubArraySum{
    
public static void main(String arg[]){
    int arr[]={1,3,5};
    int prefix[]=new int[arr.length];
    //prefix[0]=arr[0];
    int t=0;
    int ms=Integer.MIN_VALUE;
    // for(int i=0;i<arr.length;i++){
    //     for(int j=i+1;j<arr.length;j++){
    //         t=0;
    //         for(int k=i;k<=j;k++){
    //             t=t+arr[k];
    //              if(ms<t){
    //              ms=t;
    //         }
    //         }
    //     }
    // }
      // prefix[0]=arr[0];


      //prefix sum approch optimal approch;
    for(int i=0;i<prefix.length;i++){
        if(i==0){
            prefix[i]=arr[i];
        }else{
        prefix[i]=prefix[i-1]+arr[i];}
    }
        for(int i=0;i<prefix.length;i++){
        System.out.print(prefix[i]+" "); 
    }
     System.out.println();
    for(int i=0;i<prefix.length;i++){
        t=0;
        for(int j=i+1;j<prefix.length;j++){
            if(i==0){
                t=prefix[j];
            }else{
            t=0;
           t=prefix[j]-prefix[i-1];}
           if(ms<t){
            ms=t;
           }
        }
    }
    System.out.println(ms);
}
}