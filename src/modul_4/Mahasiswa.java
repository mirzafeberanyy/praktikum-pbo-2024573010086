package modul_4;

public class Mahasiswa {
    // private untuk encapsulation
    private String nama;
    private String nim;
    private String jurusan;

    // konstruktor
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // getter method
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }
}
