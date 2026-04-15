public class Mahasiswa {
    public String nim, nama, prodi;

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampilMahasiswa() {
        System.out.printf("%-10s | %-10s | %-20s\n", nim, nama, prodi);
    }
}