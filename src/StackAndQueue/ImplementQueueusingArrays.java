package StackAndQueue;

public class ImplementQueueusingArrays {
    int size;
    int[] q;
    int start;
    int end;
    int currsize;

    ImplementQueueusingArrays(int size){
        this.size=size;
        q=new int[size];
        start=end=-1;
        currsize=0;
    }
    void queue(int x){
        if(currsize==size){
            System.out.println("queue is overflow");
            return;
        }
        if(currsize==0){
            start=end=0;
        }else{
            end=(end+1)%size;
        }
        q[end]=x;
        currsize++;
    }
    int dequeu(){
        if(currsize==0){
            System.out.println("queue is underflow");
            return -1;
        }
        if(currsize==1){
            start=end=-1;
        }
        else{
            start=(start+1)%size;
        }
        currsize--;
        return q[start];
    }
    int peek(){
        if(currsize==0){
            System.out.println("queue is underflow");
            return -1;
        }
        return q[start];
    }
    void display(){
        if(currsize == 0){
            System.out.println("Queue is empty");
            return;
        }
        int i = start;
        for(int count = 0; count < currsize; count++){
            System.out.print(q[i] + " ");
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ImplementQueueusingArrays sol=new ImplementQueueusingArrays(10);
        sol.queue(2);
        sol.queue(3);
        sol.queue(4);
        sol.display();

        sol.dequeu();
        sol.display();

        System.out.println(sol.peek());

    }
}