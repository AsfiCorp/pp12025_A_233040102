package pertemuan10;

public class StackMain {
    public static void main(String[] args) {
        StrukturStack stack = new StrukturStack(3);

        System.out.println("## Sebelum push");
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        System.out.print("Elemen from TOP: ");
        stack.printStack();

        System.out.println("#nMelakukan push 3x:");
        System.out.println("push 2, push 4, push 1");
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        System.out.print("Elemen from TOP: ");
        stack.printStack();
    }
}
