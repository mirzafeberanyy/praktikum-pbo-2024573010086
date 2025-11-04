package modul_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("____________________________________________");
        System.out.println("     SISTEM KARTU RENCANA STUDI (KRS)       ");
        System.out.println("--------------------------------------------");

        System.out.print("Nama Mahasiswa    :  ");
        String nama = input.nextLine();

        System.out.print("NIM               :  ");
        String nim = input.nextLine();

        System.out.print("Jurusan           :  ");
        String jurusan = input.nextLine();

        Mahasiswa mhs = new Mahasiswa(nama, nim, jurusan, 0.0);
        RencanaKartuStudi krs = new RencanaKartuStudi(mhs, 10);

        boolean running = true;
        while (running) {
            System.out.println("______________________________________________");
            System.out.println("|                   MENU KRS                 |");
            System.out.println("|--------------------------------------------|");
            System.out.println("| 1. Tambah Mata Kuliah                      |");
            System.out.println("| 2. Input Nilai Mata Kuliah                 |");
            System.out.println("| 3. Hapus Mata Kuliah                       |");
            System.out.println("| 4. Tampilkan KRS                           |");
            System.out.println("| 5. Keluar                                  |");
            System.out.println("----------------------------------------------");
            System.out.print("Pilih menu:  ");

            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n   TAMBAH MATA KULIAH");
                    System.out.print("Kode Mata Kuliah: ");
                    String kode = input.nextLine();

                    System.out.print("Nama Mata Kuliah: ");
                    String namaMK = input.nextLine();

                    System.out.print("Jumlah SKS: ");
                    int sks = input.nextInt();
                    input.nextLine();

                    Matakuliah mk = new Matakuliah(kode, namaMK, sks);
                    krs.tambahMataKuliah(mk);
                    break;

                case 2:
                    System.out.println("\nINPUT NILAI MATA KULIAH");
                    System.out.print("Kode Mata Kuliah: ");
                    String kodeCari = input.nextLine();

                    Matakuliah mkCari = krs.cariMataKuliah(kodeCari);
                    if (mkCari != null) {
                        System.out.print("Nilai (0-100): ");
                        double nilai = input.nextDouble();
                        mkCari.setNilai(nilai);
                        System.out.println("Nilai berhasil diinput.");
                    } else {
                        System.out.println("Mata kuliah tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("\nMasukkan kode mata kuliah yang akan dihapus: ");
                    String kodeHapus = input.nextLine();
                    krs.hapusMataKuliah(kodeHapus);
                    break;

                case 4:
                    krs.tampilkanKRS();
                    break;

                case 5:
                    System.out.println("Terima Kasih!");
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
