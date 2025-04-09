package materi4;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // Latihan 2
        list.addFirst(2);
        list.addFirst(9);
        list.addFirst(7);
        list.displayList(); 

        list.removeHead();
        list.displayList(); 

        list.removeHead();
        list.removeHead();
        list.removeHead(); 

        System.out.println("---");

        // Latihan 4
        list.addFirst(1);
        list.addFirst(5);
        list.addFirst(3);
        list.addFirst(6);
        list.addFirst(2);
        list.displayList(); 
        list.removeTail();
        list.displayList(); 

        list.removeHead();
        list.displayList(); 

        list.removeTail();
        list.displayList(); 
    }
}
