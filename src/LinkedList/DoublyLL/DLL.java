package LinkedList.DoublyLL;

class Node{
    Node prev;
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
public class DLL {
    Node head;

    // insertion at begning
    public static Node insertStart(Node head,int data){
        Node newNode=new Node(data);
        if(head==null){
            return newNode;
        }
        newNode.next=head;
        head.prev=newNode;
        newNode.prev=null;
        return newNode;
    }

    //insertion at tail
    public static Node insertTail(Node head,int data){
        if(head==null){
            return new Node(data);
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;

        }
        Node newNode=new Node(data);
        newNode.next=null;
        temp.next=newNode;
        newNode.prev=temp;
        return head;
    }

    //insertion at kth position
    public static Node insertKthElement(Node head, int data, int k) {

        // insert at beginning
        if (k == 1) {
            Node newNode = new Node(data);
            if (head != null) {
                newNode.next = head;
                head.prev = newNode;
            }
            return newNode;
        }

        Node temp = head;
        int count = 1;

        while (temp != null && count < k - 1) {
            temp = temp.next;
            count++;
        }

        // k is greater than length + 1
        if (temp == null) return head;

        Node newNode = new Node(data);
        Node front = temp.next;

        newNode.next = front;
        newNode.prev = temp;
        temp.next = newNode;

        if (front != null) {
            front.prev = newNode;
        }

        return head;
    }

    //deletion of head
    public static Node deletionHead(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node prev=head;
        head=head.next;
        head.prev=null;
        prev.next=null;
        return head;
    }

    // deletion of tail
    public static Node deleteTail(Node head){
        if (head == null || head.next == null) {
            return null;
        }

        Node tail=head;
        while (tail.next!=null){
            tail=tail.next;
        }
        Node previous=tail.prev;
        previous.next = null;
        tail.prev=null;
        return head;
    }

    //deletion Kth element
    static Node removeKthElement(Node head, int k) {
        if (head == null) return null;

        int cnt = 0;
        Node kNode = head;

        while (kNode != null) {
            cnt++;
            if (cnt == k) break;
            kNode = kNode.next;
        }

        // if k is greater than length
        if (kNode == null) return head;

        Node prev = kNode.prev;
        Node front = kNode.next;

        // only one node
        if (prev == null && front == null) {
            return null;
        }
        // delete head
        else if (prev == null) {
            head = front;
            front.prev = null;
        }
        // delete tail
        else if (front == null) {
            prev.next = null;
        }
        // delete middle
        else {
            prev.next = front;
            front.prev = prev;
        }

        kNode.next = null;
        kNode.prev = null;

        return head;
    }

    //print list
    public void printList(){
        Node temp=head;
        System.out.print("null"+"<-");
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }



    public static void main(String[] args) {
        DLL dl=new DLL();
        dl.head=dl.insertStart(dl.head,5);
        dl.head=dl.insertStart(dl.head,4);
        dl.head=dl.insertStart(dl.head,3);
        dl.head=dl.insertStart(dl.head,2);
        dl.head=dl.insertTail(dl.head,6);
        dl.head=dl.insertTail(dl.head,7);
        dl.head=dl.insertTail(dl.head,8);
        dl.head=dl.deletionHead(dl.head);
        dl.head=dl.deleteTail(dl.head);
        dl.head=dl.removeKthElement(dl.head,3);
        dl.printList();

    }


}

