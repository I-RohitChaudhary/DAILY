public class LinkedList {
    Node head;

    // This node of linked list 
    class Node {
        String data;
        Node next;
        //constructor
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    // method for adding element at first at position 
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // method  for adding element at last position 
    public void addlast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null) {
            currNode=currNode.next ;
        }
        currNode.next = newNode;
    }
    // mehtod for printing the linked list
    public void printList() {

        if (head == null) {
            System.out.println("Empty-linked-list");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LinkedList newlist = new LinkedList();
        newlist.addFirst("is");
        newlist.addFirst("This");
        newlist.addlast("linked");
        newlist.addlast("list");
        newlist.addlast("concept");
        newlist.printList();
    }
}