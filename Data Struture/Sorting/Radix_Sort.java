public class Radix_Sort {
    public static void sort(int arr[],int n){
        int max=0;
        for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
        for(int place=1;max/place>0;place*=10){
            countSort(arr,n,place);
        }
        
    }
}
public static void countSort(int[] arr,int n,int place){
    int[] op=new int[n];
    int[] count=new int[10];
    for(int i=0;i<10;i++){
        count[i]=0;
    }
    for(int i=0;i<n;i++){
        count[(arr[i]/place)%10]++;
    }for(int i=1;i<10;i++){
        count[i]+=count[i-1];

    }for(int i=n-1;i>=0;i--){
        op[count[(arr[i]/place)%10]-1]=arr[i];
        count[(arr[i]/place)%10]--;
    }
    for(int i=0;i<n;i++){
        arr[i]=op[i];
    }

}
public static void main (String[] args){
    int[] arr={121,432,564,23,1,45,788};
    int n=arr.length;
    sort(arr,n);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+",");
    }

}
}
