package modul_3;

import java.util.Scanner;

public class ArrayDuaDimensi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Langkah 1: Deklarasi array 2D untuk nilai siswa (5 siswa, 4 mata pelajaran)
        String[] namaSiswa = {"Andi", "Budi", "Charlie", "Dewi", "Eka"};
        String[] mataPelajaran = {"Matematika", "Bahasa Indonesia", "IPA", "IPS"};
        int[][] nilaiSiswa = new int[5][4];

        // Langkah 2: Input nilai
        System.out.println("=== INPUT NILAI SISWA ===");
        for (int i = 0; i < namaSiswa.length; i++) {
            System.out.println("Masukkan nilai untuk " + namaSiswa[i] + ":");
            for (int j = 0; j < mataPelajaran.length; j++) {
                System.out.print(mataPelajaran[j] + ": ");
                nilaiSiswa[i][j] = input.nextInt();
            }
            System.out.println();
        }

        // Langkah 3: Menampilkan data dalam bentuk tabel
        System.out.println("=== TABEL NILAI SISWA ===");
        System.out.printf("%-10s", "Nama");
        for (int i = 0; i < mataPelajaran.length; i++) {
            System.out.printf("%-8s", mataPelajaran[i].substring(0, Math.min(7, mataPelajaran[i].length())));
        }
        System.out.printf("%-8s%-8s\n", "Total", "Rata2");

        for (int i = 0; i < namaSiswa.length; i++) {
            System.out.printf("%-10s", namaSiswa[i]);
            int total = 0;
            for (int j = 0; j < mataPelajaran.length; j++) {
                System.out.printf("%-8d", nilaiSiswa[i][j]);
                total += nilaiSiswa[i][j];
            }
            double rataRata = total / (double) mataPelajaran.length;
            System.out.printf("%-8d%-8.2f\n", total, rataRata);
        }
    }
}