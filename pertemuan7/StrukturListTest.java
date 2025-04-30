package pertemuan7;

public class StrukturListTest {
    public static void main(String[] args) {
        System.out.println("Latihan 2:");
        StrukturList list1 = new StrukturList();
        list1.tambahElemen(5);
        list1.tambahElemen(4);
        list1.tambahElemen(6);
        list1.tampilkanList();               // Output: 5 4 6
        System.out.println(list1.find(6));   // Output: true

        System.out.println("\nLatihan 4:");
        StrukturList list2 = new StrukturList();
        list2.tambahElemen(7);
        list2.tambahElemen(6);
        list2.tambahElemen(4);
        list2.tambahElemen(2);
        list2.tambahElemen(3);
        list2.tampilkanList();               // Output: 7 6 4 2 3
        System.out.println(list2.size());    // Output: 5

        System.out.println("\nTugas:");
        StrukturList list3 = new StrukturList();
        list3.tambahElemen(4);
        list3.tambahElemen(3);
        list3.tambahElemen(7);
        list3.tambahElemen(8);
        list3.tambahElemen(1);
        list3.tambahElemen(9);
        list3.tampilkanList();               // Output: 4 3 7 8 1 9
        list3.clear();
        list3.tampilkanList();               // Output: List Kosong
    }
}
