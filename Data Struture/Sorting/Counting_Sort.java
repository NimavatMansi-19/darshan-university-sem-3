public class Counting_Sort {
public static void main(String[] args) {
    int[] arr={4,1,2,6,1,2,3,5,3};
    int len=arr.length;
    int max=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    //System.out.println(max);
    int[] c=new int[max+1];
    int[] b=new int[arr.length];
    for(int i=1;i<=max;i++){
        c[i]=0;
    }for(int j=0;j<len;j++){
        c[arr[j]]++;
    }
    for(int i=2;i<=max;i++){
        c[i]=c[i]+c[i-1];
    }
    for(int i=len-1;i>=0;i--){
        b[c[arr[i]]-1]=arr[i];
        c[arr[i]]--;
    }
    
    
    for(int i=0;i<len;i++){
        System.out.print(b[i]+",");
    }
}
}