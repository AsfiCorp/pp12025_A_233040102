package pertemuan8Latihan;

public class ListMatakuliah {
    private Node head;

    public ListMatakuliah() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public void displayElement() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            Node curNode = head;
            while (curNode != null) {
                Matakuliah mk = curNode.getData();
                System.out.println("Matakuliah: " + mk.getKode() + ", " + mk.getNama() + ", " + mk.getSks());
                curNode = curNode.getNext();
            }
        }
        System.out.println();
    }

    public int count() {
        int jumlah = 0;
        Node curNode = head;
        while (curNode != null) {
            jumlah++;
            curNode = curNode.getNext();
        }
        return jumlah;
    }
}
