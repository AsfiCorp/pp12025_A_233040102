package pertemuan8Latihan;

public class ListMkTest {
    public static void main(String[] args) {
        ListMatakuliah list = new ListMatakuliah();

        list.addHead(new Matakuliah("IF001", "Dasar Pemrograman", 4));
        list.addHead(new Matakuliah("IF002", "Pemrograman Web", 3));
        list.addHead(new Matakuliah("IF003", "Struktur Diskrit", 3));
        list.addHead(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
        list.addHead(new Matakuliah("IF005", "Sistem Operasi", 4));
        list.addHead(new Matakuliah("IF006", "Jaringan Komputer", 3));

        list.displayElement();
        System.out.println("Jumlah Matakuliah: " + list.count());
    }
}
