package tugaspertemuan4;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list1 = new StrukturList();
        list1.addFirst(3.4);
        list1.addFirst(2.1);
        list1.addLast(4.5);
        System.out.print("List 1: ");
        list1.display(); // Output: 2.1 3.4 4.5

        StrukturList list2 = new StrukturList();
        list2.addFirst(5.5);
        list2.addFirst(4.5);
        list2.addFirst(1.1);
        list2.addFirst(2.1);
        list2.addFirst(3.4);
        System.out.print("List 2: ");
        list2.display(); // Output: 3.4 2.1 1.1 4.5 5.5
    }
}

