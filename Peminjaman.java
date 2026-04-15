public class Peminjaman {
    public Mahasiswa mhs;
    public Buku buku;
    public int lamaPinjam;
    public int batasPinjam = 5;
    public int terlambat;
    public int denda;

    public Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    public void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    public void tampilPeminjaman() {
        System.out.printf("%-10s | %-10s | %-15s | %-10d | %-10d | Rp %-10d\n", 
            mhs.nim, mhs.nama, buku.judul, lamaPinjam, terlambat, denda);
    }
}