package materi4;

public class StrukturList {
    Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public void removeHead() {
        if (head != null) {
            Node temp = head;
            head = head.next;
            dispose(temp);
        }
    }

    public void removeTail() {
        if (head == null) return;
        if (head.next == null) {
            dispose(head);
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        dispose(current.next);
        current.setNext(null);
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    private void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }
}
