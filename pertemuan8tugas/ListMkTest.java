package pertemuan8tugas;

import java.util.Scanner;

public class ListMkTest {
    public static void main(String[] args) {
        ListMatakuliah list = new ListMatakuliah();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu Matakuliah ===");
            System.out.println("1. Tambah di Awal");
            System.out.println("2. Tambah di Tengah");
            System.out.println("3. Tambah di Akhir");
            System.out.println("4. Hapus di Awal");
            System.out.println("5. Hapus di Tengah");
            System.out.println("6. Hapus di Akhir");
            System.out.println("7. Cari Matakuliah");
            System.out.println("8. Tampilkan Semua");
            System.out.println("9. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    list.addHead(inputData(sc));
                    break;
                case 2:
                    System.out.print("Posisi: ");
                    int pos = sc.nextInt();
                    sc.nextLine();
                    list.addMiddle(inputData(sc), pos);
                    break;
                case 3:
                    list.addTail(inputData(sc));
                    break;
                case 4:
                    list.removeHead();
                    break;
                case 5:
                    System.out.print("Posisi: ");
                    int posHapus = sc.nextInt();
                    sc.nextLine();
                    list.removeMiddle(posHapus);
                    break;
                case 6:
                    list.removeTail();
                    break;
                case 7:
                    System.out.print("Masukkan kode: ");
                    String kode = sc.nextLine();
                    Matakuliah mk = list.find(kode);
                    if (mk != null) {
                        System.out.println("Ditemukan: " + mk.getKode() + ", " + mk.getNama() + ", " + mk.getSks());
                    } else {
                        System.out.println("Tidak ditemukan.");
                    }
                    break;
                case 8:
                    list.displayElement();
                    break;
                case 9:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 9);

        sc.close();
    }

    public static Matakuliah inputData(Scanner sc) {
        System.out.print("Kode: ");
        String kode = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("SKS: ");
        int sks = sc.nextInt();
        sc.nextLine();
        return new Matakuliah(kode, nama, sks);
    }
}
