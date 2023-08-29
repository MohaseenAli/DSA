package DSA;

public class LL {
    Node head;
    static class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next= null;
        }
    }

    //add - first, last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast (String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

//    Print list
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        Node currentNode = head;
        while (currentNode!=null){
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("The list is empty");
           return;
        }
        head=head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    public void deleteMiddle(String data){
        Node previousNode=head;
        while(!(previousNode.next.data.equals(data))){
            previousNode=previousNode.next;
        }
        previousNode.next=previousNode.next.next;
    }

    public void reverseList(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

//            Update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    public static void main(String[] args) {
        LL list = new LL();
/*
        list.addFirst("2");
        list.printList();
        list.addFirst("1");
        list.printList();
        list.addLast("3");
        list.printList();
*/
        list.addFirst("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.printList();
        list.deleteMiddle("3");
        list.printList();
//        list.deleteFirst();
//        list.printList();
//        list.deleteLast();
//        list.printList();

        list.reverseList();
        list.printList();
    }
}