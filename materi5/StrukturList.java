package materi5;

public class StrukturList {
    private Node HEAD;

    public StrukturList() {
        HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addFirst(int nilai) {
        Node newNode = new Node(nilai);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    public void removeMid(int e) {
        Node preNode = new Node(0);
        Node tempNode;
        int i;
        boolean ketemu;

        if (isEmpty()) {
            System.out.println("Elemen list kosong");
        } else {
            ketemu = false;
            i = 1;
            tempNode = HEAD;

            while (tempNode != null && !ketemu) {
                if (tempNode.getNilai() == e) {
                    ketemu = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }
            }

            if (ketemu) {
                if (i == 1) {
                    HEAD = HEAD.getNext(); // menghapus head
                } else {
                    preNode.setNext(tempNode.getNext());
                    dispose(tempNode);
                }
            }
        }
    }

    public void displayList() {
        Node current = HEAD;
        while (current != null) {
            System.out.print(current.getNilai() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void dispose(Node node) {
        node.setNext(null);
        node = null;
    }
}
