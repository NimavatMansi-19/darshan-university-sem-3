import java.util.Scanner;

class CQ{
    int f=-1;
    int r=-1;
    int size;
    int[] CQueue;
    CQ(int size){
        this.size=size;
       this.CQueue=new int[size];
    }
    public void CQ_Insert(int data){
        if(r==size){
            r=1;
        }else{
            r++;
        }
        if(f==r){
            System.out.println("Queue Overflow::");
        }
        CQueue[r]=data;
        if(f==-1){
            f=0;
        }
        System.out.println(f);
        
    }
    public int CQ_Dequeue(){
        if(f==-1){
            System.err.println("Queue underflow:");
            return (0);
        }
        int y=CQueue[f];
        if(f==r){
            f=-1;
            r=-1;
            return y;
        }
        f = (f+1)%size;
        
        return (CQueue[f]);
    }
    public void Display_CQueue(){
        for(int i = f; ; i=(i+1)%size){
            System.out.print(CQueue[i]);
            if(i==r) break;
        }
        
    }
}
public class Circular_Queue {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Size of Queue:");
    int a=sc.nextInt();
    CQ Q=new CQ(a);
   while (true) {
    System.out.println("Enter 1 to Insert in Queue:");
    System.out.println("Enter 2 to Delete in Queue:");
    int b=sc.nextInt();
    if(b==1){
    System.out.println("Enter element to be Inserted:");
    int c=sc.nextInt();
    Q.CQ_Insert(c);
    
    }
    else if(b==2){
        Q.CQ_Dequeue();
    }else if(b==3){
        Q.Display_CQueue();
    }
    else{
        break;
    }
   }
    }
}
