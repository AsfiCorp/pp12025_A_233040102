package pertemuan10;

public class Tugas {
    public static void main(String[] args) {
        StrukturStack stack = new StrukturStack(3);

        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Setelah push:");
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        System.out.print("Elemen dari TOP: ");
        stack.printStack();

        
        System.out.println("\nMelakukan pop 2x:");
        stack.pop(); 
        stack.pop(); 

        System.out.println("Setelah pop:");
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        System.out.print("Elemen dari TOP: ");
        stack.printStack();
    }
}
