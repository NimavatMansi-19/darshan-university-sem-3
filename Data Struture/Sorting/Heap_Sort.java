public class Heap_Sort {
    public static void HeapSort(int[] arr){
        int n=arr.length;
        buildMaxHeap(arr);
        for(int i=n-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }
    }
    public static void buildMaxHeap(int[] arr){
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
    }
    public static void heapify(int[] arr,int n,int i){
        int max=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && arr[l]>arr[max]){
            max=l;
        }
        if(i!=max){
            int x=arr[i];
            arr[i]=arr[max];
            arr[max]=x;
            heapify(arr,n,max);
        }
    }
    public static void main (String[] args){
        int[] arr={4,10,3,5,1};
        HeapSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
