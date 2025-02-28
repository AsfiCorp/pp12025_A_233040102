package tugaspertemuan4;

public class StrukturList {
	    private Node head;

	    public StrukturList() {
	        this.head = null;
	    }

	    // Fungsi untuk menambahkan elemen di awal list
	    public void addFirst(double data) {
	        Node newNode = new Node(data);
	        newNode.setNext(head);
	        head = newNode;
	    }

	    // Fungsi untuk menambahkan elemen di akhir list
	    public void addLast(double data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;
	            while (temp.getNext() != null) {
	                temp = temp.getNext();
	            }
	            temp.setNext(newNode);
	        }
	    }

	    // Fungsi untuk menambahkan elemen di tengah list
	    public void addMid(double data, int position) {
	        Node newNode = new Node(data);
	        if (head == null || position == 1) {
	            newNode.setNext(head);
	            head = newNode;
	        } else {
	            Node temp = head;
	            for (int i = 1; i < position - 1 && temp.getNext() != null; i++) {
	                temp = temp.getNext();
	            }
	            newNode.setNext(temp.getNext());
	            temp.setNext(newNode);
	        }
	    }

	    // Fungsi untuk menampilkan list
	    public void display() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.getData() + " ");
	            temp = temp.getNext();
	        }
	        System.out.println();
	    }
	}