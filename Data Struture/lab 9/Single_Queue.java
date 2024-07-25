import java.util.Scanner;

class Queue {
    int f=-1;
    int r=-1;
    int size; 
    int[] Queue;
    Queue(int size){
        this.size=size;
    this.Queue=new int[size];
    }
    public void Enqueue(int data) {
        if(r>=size-1){
            System.out.println("Queue Overflow:");
            return;
        }
        r++;
        Queue[r]=data;
        if(f==-1){
            f=0;
        }  
    }
    public int Dequeue(){
        if(f==-1){
            System.err.println("Queue underflow:");
            return (0);
        }int y=Queue[f];
        if(f==r){
            f=0;
            r=0;
        }else{
            f++;
        }
        return (Queue[f]);
    }
    public void Display_Queue(){
        System.out.println("Your Queue has>>");
        for(int i=f;i<size;i++){
            System.out.print(Queue[i]);
        }
        System.out.println();
        
    }
}
    public class Single_Queue{
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Size of Queue:");
    int a=sc.nextInt();
    Queue Q=new Queue(a);
   while (true) {
    System.out.println("Enter 1 to Insert in Queue:");
    System.out.println("Enter 2 to Delete in Queue:");
    int b=sc.nextInt();
    if(b==1){
    System.out.println("Enter element to be Inserted:");
    int c=sc.nextInt();
    Q.Enqueue(c);
    }else if(b==2){
        Q.Dequeue();
    }else if(b==3){
        Q.Display_Queue();
    }
    else{
        break;
    }
   }
   } 
}
