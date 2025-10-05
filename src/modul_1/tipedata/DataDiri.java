package modul_1.tipedata;

import java.time.LocalDate;

public class DataDiri {
    public static void main(String[] args) {
        // Data dasar
        String namaLengkap = "Mirza Feberani";
        char jenisKelamin = 'L';
        LocalDate tanggalLahir = LocalDate.of(2006, 2, 8);
        int usia = 19;
        String tempatLahir = "Bener Meriah";
        String alamat = "Blang Mangat, Aceh";
        long nik = 1203045678901234L;
        long noHp = 6282316331635L;
        String email = "mirzafeberani@gmail.com";

        // Data akademik
        String perguruantinggi = "Politeknik Negeri Lhokseumawe";
        String jurusan = "Teknologi Informasi dan Komputer";
        int semester = 3;
        float ipk = 3.7f;
        boolean mahasiswaAktif = true;

        // Data fisik
        double tinggiBadan = 162.5;
        double beratBadan = 65.2;

        // Data keluarga
        int jumlahSaudara = 3;
        boolean anakTunggal = false;

        // Data tambahan
        String[] hobi = {"Sepak Bola", "Belajar", "Membaca", "Ngopi"};
        String statusPernikahan = "Belum Menikah";

        System.out.println("=== DATA DIRI ===");
        System.out.println("Nama Lengkap     : " + namaLengkap);
        System.out.println("Jenis Kelamin    : " + jenisKelamin);
        System.out.println("Tempat, Tgl Lahir: " + tempatLahir + ", " + tanggalLahir);
        System.out.println("Usia             : " + usia + " tahun");
        System.out.println("Alamat           : " + alamat);
        System.out.println("NIK              : " + nik);
        System.out.println("No. HP           : " + noHp);
        System.out.println("Email            : " + email);
        System.out.println("Status           : " + statusPernikahan);

        System.out.println("\n=== DATA AKADEMIK ===");
        System.out.println("Perguruan Tinggi : " + perguruantinggi);
        System.out.println("Jurusan          : " + jurusan);
        System.out.println("Semester         : " + semester);
        System.out.println("IPK              : " + ipk);
        System.out.println("Mahasiswa Aktif  : " + mahasiswaAktif);

        System.out.println("\n=== DATA FISIK ===");
        System.out.println("Tinggi Badan     : " + tinggiBadan + " cm");
        System.out.println("Berat Badan      : " + beratBadan + " kg");

        System.out.println("\n=== DATA KELUARGA ===");
        System.out.println("Jumlah Saudara   : " + jumlahSaudara);
        System.out.println("Anak Tunggal     : " + anakTunggal);

        System.out.print("\nHobi             : ");
        for (String h : hobi) {
            System.out.print(h + ", ");
        }
    }
}
