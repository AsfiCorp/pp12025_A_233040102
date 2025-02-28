package pertemuan4;

public class StrukturList {
	private Node head;
	
	public StrukturList() {
		this.head= null;
	}
		public void addMid(int data, int position) {
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
		public void display() {
	     Node temp = head;
	    while (temp != null) {
	     System.out.print(temp.getData() + "  ");
	     temp = temp.getNext();
	        }
	     System.out.println();
	    }
}
	
