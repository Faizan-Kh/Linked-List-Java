public class LinkedList {
    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(Patient ptn) {
        Node node = new Node(ptn);
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.n != null) {
                current = current.n;
            }
            current.n = node;
        }

    }

    public void display() {
        Node p1 = head;
        while (p1 != null) {
            System.out.print(" " + p1.p);
            p1 = p1.n;
        }
    }
}
