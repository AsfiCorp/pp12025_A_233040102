package pertemuan8tugas;

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

    public void addTail(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node cur = head;
            while (cur.getNext() != null) {
                cur = cur.getNext();
            }
            cur.setNext(newNode);
        }
    }

    public void addMiddle(Matakuliah data, int posisi) {
        if (posisi <= 1) {
            addHead(data);
        } else if (posisi > count()) {
            addTail(data);
        } else {
            Node newNode = new Node(data);
            Node cur = head;
            for (int i = 1; i < posisi - 1; i++) {
                cur = cur.getNext();
            }
            newNode.setNext(cur.getNext());
            cur.setNext(newNode);
        }
    }

    public void removeHead() {
        if (!isEmpty()) {
            head = head.getNext();
        }
    }

    public void removeTail() {
        if (!isEmpty()) {
            if (head.getNext() == null) {
                head = null;
            } else {
                Node cur = head;
                while (cur.getNext().getNext() != null) {
                    cur = cur.getNext();
                }
                cur.setNext(null);
            }
        }
    }

    public void removeMiddle(int posisi) {
        if (posisi <= 1) {
            removeHead();
        } else if (posisi >= count()) {
            removeTail();
        } else {
            Node cur = head;
            for (int i = 1; i < posisi - 1; i++) {
                cur = cur.getNext();
            }
            cur.setNext(cur.getNext().getNext());
        }
    }

    public Matakuliah find(String kode) {
        Node cur = head;
        while (cur != null) {
            if (cur.getData().getKode().equalsIgnoreCase(kode)) {
                return cur.getData();
            }
            cur = cur.getNext();
        }
        return null;
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
