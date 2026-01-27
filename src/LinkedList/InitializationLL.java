package LinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class InitializationLL {
    Node head;
    InitializationLL(){
        head=null;
    }
    // insert at begning
    void insertStart(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    // insert at end
    void insertEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    // deletion of head of LL
    Node deleteHead(Node head){
        if(head==null){
            return null;
        }
        head=head.next;
        return head;
    }

    // delete tail of LL
    Node deleteTail(Node head){
        Node temp=head;
        if(head==null || head.next==null){
            return null;
        }
        while (temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    // print list
    void printList(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InitializationLL l=new InitializationLL();
        l.insertStart(10);
        l.insertStart(20);
        l.insertEnd(30);
        l.insertEnd(40);
        l.head=l.deleteHead(l.head);
        l.head=l.deleteTail(l.head);
        l.printList();
    }
}







