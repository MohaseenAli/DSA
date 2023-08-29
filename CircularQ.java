package DSA;

public class CircularQ {
    static class CQueue{
        static int [] arr;
        static int size;
        static int front=-1;
        static int rear=-1;

        CQueue(int n){
            arr = new int[n];
            size=n;
        }

        public static boolean isEmpty(){
            return front==-1 && rear==-1;
        }

        public static boolean isFull(){
            return (rear+1) % size == front;
        }
        public static void add(int data){
            if (isFull()){
                System.out.println("queue Full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear = (rear+1)%size;
            arr[rear]=data;
        }

        public static int remove(){
            if (isEmpty()){
                System.out.println("empty queue");
                return -1 ;
            }

            int result=arr[front];
            if(rear==front){
                rear=front=-1;
            }

            else {
                front = (front + 1) % size;
            }
            return result;
        }

        public static int peek(){
            if (isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        CQueue q = new CQueue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        q.add(6);
        q.remove();
        q.add(7);
        while (! q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}