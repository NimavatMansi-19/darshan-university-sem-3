public class Shell_Sort {
    public static  void Shell(int[] arr) {
        int n=arr.length;
        for(int gap=n/2;gap>=1;gap=gap/2){
            for(int j=gap;j<n;j++){
                for(int i=j-gap;i>=0;i=i-gap){
                    if(arr[i+gap]>arr[i]){
                        break;
                    }else{
                        int temp=arr[i+gap];
                        arr[i+gap]=arr[i];
                        arr[i]=temp;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+",");
        }
        
    }
    public static void main(String[] args) {
        int[] a={1,5,3,8,4};
        Shell(a);
        
        
    }
}
