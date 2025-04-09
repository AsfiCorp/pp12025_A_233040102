package materi5;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addFirst(1);
        list.addFirst(5);
        list.addFirst(3);
        list.addFirst(6);
        list.addFirst(2); // List: 2 6 3 5 1

        list.displayList(); // Output: 2 6 3 5 1

        list.removeMid(3);
        list.displayList(); // Output: 2 6 5 1

        list.removeMid(6);
        list.removeMid(5);
        list.displayList(); // Output: 2 1
    }
}
