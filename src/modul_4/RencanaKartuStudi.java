package modul_4;

public class RencanaKartuStudi {
    private Mahasiswa mahasiswa;
    private Matakuliah[] daftarMataKuliah;
    private int jumlahMatKul;
    private int maxMatkul;
    private static final int BATAS_SKS = 24;

    public RencanaKartuStudi(Mahasiswa mahasiswa, int maxMatkul) {
        this.mahasiswa = mahasiswa;
        this.maxMatkul = maxMatkul;
        this.daftarMataKuliah = new Matakuliah[maxMatkul];
        this.jumlahMatKul = 0;
    }

    public boolean tambahMataKuliah(Matakuliah matkul) {
        int totalSKS = hitungTotalSKS();
        if (totalSKS + matkul.getSks() > BATAS_SKS) {
            System.out.println("\nGagal menambah: Total SKS melebihi batas " + BATAS_SKS);
            return false;
        }

        if (jumlahMatKul < maxMatkul) {
            daftarMataKuliah[jumlahMatKul] = matkul;
            jumlahMatKul++;
            System.out.println("\nMata Kuliah " + matkul.getNama() + " berhasil ditambah");
            return true;
        } else {
            System.out.println("\nKRS sudah penuh (maks " + maxMatkul + " mata kuliah)");
            return false;
        }
    }

    public boolean hapusMataKuliah(String kode) {
        for (int i = 0; i < jumlahMatKul; i++) {
            if (daftarMataKuliah[i].getKode().equalsIgnoreCase(kode)) {
                for (int j = i; j < jumlahMatKul - 1; j++) {
                    daftarMataKuliah[j] = daftarMataKuliah[j + 1];
                }
                daftarMataKuliah[jumlahMatKul - 1] = null;
                jumlahMatKul--;
                System.out.println("\nMata kuliah " + kode + " berhasil dihapus.");
                return true;
            }
        }
        System.out.println("\nMata kuliah dengan kode " + kode + " tidak ditemukan.");
        return false;
    }

    public int hitungTotalSKS() {
        int total = 0;
        for (int i = 0; i < jumlahMatKul; i++) {
            total += daftarMataKuliah[i].getSks();
        }
        return total;
    }

    public double hitungIPK() {
        if (jumlahMatKul == 0) return 0.0;
        double totalBobot = 0.0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMatKul; i++) {
            totalBobot += daftarMataKuliah[i].getBobotNilai() * daftarMataKuliah[i].getSks();
            totalSKS += daftarMataKuliah[i].getSks();
        }

        return totalSKS > 0 ? totalBobot / totalSKS : 0.0;
    }

    public Matakuliah cariMatkulTerbaik() {
        if (jumlahMatKul == 0) return null;
        Matakuliah terbaik = daftarMataKuliah[0];
        for (int i = 1; i < jumlahMatKul; i++) {
            if (daftarMataKuliah[i].getNilai() > terbaik.getNilai()) {
                terbaik = daftarMataKuliah[i];
            }
        }
        return terbaik;
    }

    public Matakuliah cariMatkulTerburuk() {
        if (jumlahMatKul == 0) return null;
        Matakuliah terburuk = daftarMataKuliah[0];
        for (int i = 1; i < jumlahMatKul; i++) {
            if (daftarMataKuliah[i].getNilai() < terburuk.getNilai()) {
                terburuk = daftarMataKuliah[i];
            }
        }
        return terburuk;
    }

    public Matakuliah cariMataKuliah(String kode) {
        for (int i = 0; i < jumlahMatKul; i++) {
            if (daftarMataKuliah[i].getKode().equalsIgnoreCase(kode)) {
                return daftarMataKuliah[i];
            }
        }
        return null;
    }

    public void tampilkanKRS() {
        System.out.println("-----------------------------------------------------");
        System.out.println("|               KARTU RENCANA STUDI                 |");
        System.out.println("-----------------------------------------------------");
        System.out.println("Nama Mahasiswa  : " + mahasiswa.getNama());
        System.out.println("NPM             : " + mahasiswa.getNim());
        System.out.println("Jurusan         : " + mahasiswa.getJurusan());
        System.out.println("-----------------------------------------------------");
        System.out.println("KODE       MATA KULIAH                   SKS    NILAI");
        System.out.println("-----------------------------------------------------");

        if (jumlahMatKul == 0) {
            System.out.println("Belum ada mata kuliah yang diambil.");
        } else {
            for (int i = 0; i < jumlahMatKul; i++) {
                daftarMataKuliah[i].tampilkanInfo();
            }
        }

        System.out.println("-----------------------------------------------------");
        System.out.printf("Total SKS: %d | IPK: %.2f%n", hitungTotalSKS(), hitungIPK());

        Matakuliah terbaik = cariMatkulTerbaik();
        Matakuliah terburuk = cariMatkulTerburuk();

        if (terbaik != null) {
            System.out.println("Nilai Terbaik : " + terbaik.getNama() + " (" + (int) terbaik.getNilai() + ")");
        }
        if (terburuk != null) {
            System.out.println("Nilai Terburuk: " + terburuk.getNama() + " (" + (int) terburuk.getNilai() + ")");
        }

        System.out.println("-----------------------------------------------------");
    }
}
