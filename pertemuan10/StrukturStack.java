package pertemuan10;

public class StrukturStack {

    private int[] array;
    private int capacity;
    private int TOP;
    public final int MIN = -1;

    public StrukturStack(int capacity) {
        super();
        this.capacity = capacity;
        array = new int[capacity];
        TOP = MIN;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            TOP++;
            array [TOP]= data;
        }
    }

    public boolean isEmpty() {
        return (TOP == MIN);
    }

    public boolean isFull() {
        return (TOP == capacity - 1);
    }

    public int size() {
        return (TOP + 1);
    }

    public int top() {
        if (!isEmpty()) {
            return array[TOP];
        } else {
            return -1;
        }
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("");
        } else {
            for (int i = 0; i <= TOP; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong, tidak ada yang bisa di-pop");
        } else {
            TOP--; 
        }
    }
}
