package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InitializationLL {

    Node head;

    // insert at beginning
    void insertStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // insert at end
    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    // delete head
    void deleteHead() {
        if (head != null)
            head = head.next;
    }

    // delete tail
    void deleteTail() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;
        temp.next = null;
    }

    // delete at index (1-based)
    void deleteAtIndex(int k) {
        if (head == null) return;
        if (k == 1) {
            head = head.next;
            return;
        }
        Node prev = null, temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == k) {
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    // delete by value
    void deleteElement(int ele) {
        if (head == null) return;
        if (head.data == ele) {
            head = head.next;
            return;
        }
        Node prev = null, temp = head;
        while (temp != null) {
            if (temp.data == ele) {
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    // insert at position
    void insertAt(int val, int k) {
        if (k == 1) {
            insertStart(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < k - 1 && temp != null; i++)
            temp = temp.next;
        if (temp != null) {
            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    // insert before value
    void insertBeforeValue(int el, int val) {
        if (head == null) return;
        if (head.data == val) {
            insertStart(el);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == val) {
                Node newNode = new Node(el);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
    }

    // print list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InitializationLL l = new InitializationLL();
        l.insertStart(10);
        l.insertStart(20);
        l.insertEnd(30);
        l.insertEnd(40);
        l.deleteHead();
        l.deleteTail();
        l.insertStart(50);
        l.insertStart(60);
        l.insertStart(70);
        l.deleteAtIndex(3);
        l.deleteElement(50);
        l.insertAt(112, 1);
        l.insertBeforeValue(99, 112);
        l.printList();
    }
}
