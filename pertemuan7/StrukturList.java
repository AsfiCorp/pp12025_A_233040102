package pertemuan7;

public class StrukturList {
    Node HEAD;

    public StrukturList() {
        HEAD = null;
    }

    // Menambahkan elemen ke akhir list
    public void tambahElemen(int data) {
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            Node current = HEAD;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Menampilkan semua elemen list
    public void tampilkanList() {
        if (HEAD == null) {
            System.out.println("List Kosong");
            return;
        }

        Node current = HEAD;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Operasi FIND
    public boolean find(int x) {
        Node curNode = HEAD;
        boolean ketemu = false;

        while (curNode != null && !ketemu) {
            if (curNode.data == x) {
                ketemu = true;
            } else {
                curNode = curNode.next;
            }
        }

        return ketemu;
    }

    // Operasi SIZE
    public int size() {
        int count = 0;
        Node current = HEAD;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Operasi CLEAR
    public void clear() {
        HEAD = null;
    }
}
