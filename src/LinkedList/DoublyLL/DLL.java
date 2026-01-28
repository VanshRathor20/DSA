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

    // delete Node element
    static Node deleteNode(Node head, Node temp) {
        if (temp == null) return head;

        // deleting head
        if (temp.prev == null) {
            head = temp.next;
            if (head != null) head.prev = null;
            return head;
        }

        Node prev = temp.prev;
        Node front = temp.next;

        if (front == null) {
            prev.next = null;
        } else {
            prev.next = front;
            front.prev = prev;
        }

        temp.next = null;
        temp.prev = null;
        return head;
    }

    //print list
    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }



    public static void main(String[] args) {
        DLL dl=new DLL();

    }


}

