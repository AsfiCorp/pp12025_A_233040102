package pertemuan4;

public class StrukturListTest {
	public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addMid(3, 1);  // Tambah di awal
        list.addMid(4, 2);  // Tambah di akhir
        list.addMid(7, 2);  // Tambah di posisi 2
        list.addMid(8, 2);  // Tambah di posisi 2
        list.addMid(5, 1);  // Tambah di awal
        
        list.display(); // Output: 5 3 8 7 4
    }
}

