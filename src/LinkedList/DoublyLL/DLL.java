package LinkedList.DoublyLL;



class DoublyNode {
    int data;
    DoublyNode prev;
    DoublyNode next;

    public DoublyNode(int data) {
        this.data = data;
    }
}

public class DLL {
    DoublyNode head;

    // insertion at begning
    public static DoublyNode insertStart(DoublyNode head,int data){
        DoublyNode newNode=new DoublyNode(data);
        if(head==null){
            return newNode;
        }
        newNode.next=head;
        head.prev=newNode;
        newNode.prev=null;
        return newNode;
    }

    //insertion at tail
    public static DoublyNode insertTail(DoublyNode head,int data){
        if(head==null){
            return new DoublyNode(data);
        }
        DoublyNode temp=head;
        while(temp.next!=null){
            temp=temp.next;

        }
        DoublyNode newNode=new DoublyNode(data);
        newNode.next=null;
        temp.next=newNode;
        newNode.prev=temp;
        return head;
    }

    //insertion at kth position
    public static DoublyNode insertKthElement(DoublyNode head, int data, int k) {

        // insert at beginning
        if (k == 1) {
            DoublyNode newNode = new DoublyNode(data);
            if (head != null) {
                newNode.next = head;
                head.prev = newNode;
            }
            return newNode;
        }

        DoublyNode temp = head;
        int count = 1;

        while (temp != null && count < k - 1) {
            temp = temp.next;
            count++;
        }

        // k is greater than length + 1
        if (temp == null) return head;

        DoublyNode newNode = new DoublyNode(data);
        DoublyNode front = temp.next;

        newNode.next = front;
        newNode.prev = temp;
        temp.next = newNode;

        if (front != null) {
            front.prev = newNode;
        }

        return head;
    }

    //deletion of head
    public static DoublyNode deletionHead(DoublyNode head){
        if(head==null || head.next==null){
            return null;
        }
        DoublyNode prev=head;
        head=head.next;
        head.prev=null;
        prev.next=null;
        return head;
    }

    // deletion of tail
    public static DoublyNode deleteTail(DoublyNode head){
        if (head == null || head.next == null) {
            return null;
        }

        DoublyNode tail=head;
        while (tail.next!=null){
            tail=tail.next;
        }
        DoublyNode previous=tail.prev;
        previous.next = null;
        tail.prev=null;
        return head;
    }

    //deletion Kth element
    static DoublyNode removeKthElement(DoublyNode head, int k) {
        if (head == null) return null;

        int cnt = 0;
        DoublyNode kNode = head;

        while (kNode != null) {
            cnt++;
            if (cnt == k) break;
            kNode = kNode.next;
        }

        // if k is greater than length
        if (kNode == null) return head;

        DoublyNode prev = kNode.prev;
        DoublyNode front = kNode.next;

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

    // reverse a DLL
    public static DoublyNode reverse(DoublyNode head){
        DoublyNode prev=null;
        DoublyNode curr=head;
        while(curr!=null){
            prev=curr.prev;
            curr.prev=curr.next;
            curr.next=prev;
            curr=curr.prev;
        }
        return prev.prev;
    }

    //print list
    public void printList(){
        DoublyNode temp=head;
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
        dl.head=dl.reverse(dl.head);
        dl.printList();

    }


}

