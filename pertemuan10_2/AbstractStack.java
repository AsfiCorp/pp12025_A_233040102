package pertemuan10_2;

public class AbstractStack {
    protected int[] arr;
    protected int top;
    protected int maxSize;

    public AbstractStack(int capacity) {
        maxSize = capacity;
        arr = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        arr[++top] = value;
    }

    public int pop() {
        return arr[top--];
    }

    public int peek() {
        return arr[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public int size() {
        return top + 1;
    }
}
