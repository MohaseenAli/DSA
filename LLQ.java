package DSA;

public class LLQ {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class LLQueue{
        static Node head = null;
        static Node tail = null;

         public static boolean isEmpty(){
             return head==null && tail == null;
         }

         public static void add(int data){
             Node newNode = new Node(data);
             if(tail==null){
                 tail=head=newNode;
                 return;
             }
             tail.next=newNode;
             tail=newNode;
         }

         public static int remove(){
             if(isEmpty()){
                 System.out.println("empty queue");
             }
             if (head==tail){
                 tail=null;
             }
             int front = head.data;
             head=head.next;
             return front;
         }

         public static int peek(){
             if (isEmpty()){
                 System.out.println("empty queue");
                 return -1;
             }
             return head.data;
         }
    }
    public static void main(String[] args) {
        LLQueue q = new LLQueue();
        q.add(1);
        q.add(2);
        q.remove();
        q.add(3);
        q.add(4);
        q.remove();
        q.add(5);
        q.add(6);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
