public class Buku {
    public String kodeBuku, judul;
    public int tahunTerbit;

    public Buku(String kode, String judul, int tahun) {
        this.kodeBuku = kode;
        this.judul = judul;
        this.tahunTerbit = tahun;
    }

    public void tampilBuku() {
        System.out.printf("%-10s | %-15s | %-5d\n", kodeBuku, judul, tahunTerbit);
    }
}