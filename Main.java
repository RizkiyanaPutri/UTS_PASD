import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ================= INPUT DATA =================
        System.out.print("Jumlah Mahasiswa: ");
        int jmlMhs = sc.nextInt();
        sc.nextLine();
        Mahasiswa[] daftarMhs = new Mahasiswa[jmlMhs];

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Prodi : ");
            String prodi = sc.nextLine();
            daftarMhs[i] = new Mahasiswa(nim, nama, prodi);
        }

        System.out.print("\nJumlah Buku: ");
        int jmlBuku = sc.nextInt();
        sc.nextLine();
        Buku[] daftarBuku = new Buku[jmlBuku];

        for (int i = 0; i < jmlBuku; i++) {
            System.out.println("Buku ke-" + (i + 1));
            System.out.print("Kode  : ");
            String kode = sc.nextLine();
            System.out.print("Judul : ");
            String judul = sc.nextLine();
            System.out.print("Tahun : ");
            int tahun = sc.nextInt();
            sc.nextLine();
            daftarBuku[i] = new Buku(kode, judul, tahun);
        }

        System.out.print("\nJumlah Peminjaman: ");
        int jmlPinjam = sc.nextInt();
        Peminjaman[] daftarPinjam = new Peminjaman[jmlPinjam];

        for (int i = 0; i < jmlPinjam; i++) {
            System.out.println("Peminjaman ke-" + (i + 1));

            System.out.print("Index1 Mahasiswa: ");
            int m = sc.nextInt();

            System.out.print("Index Buku: ");
            int b = sc.nextInt();

            System.out.print("Lama Pinjam: ");
            int lama = sc.nextInt();

            daftarPinjam[i] = new Peminjaman(daftarMhs[m], daftarBuku[b], lama);
        }

        // ================= MENU =================
        int pilihan;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    for (Mahasiswa m : daftarMhs) m.tampilMahasiswa();
                    break;

                case 2:
                    for (Buku b : daftarBuku) b.tampilBuku();
                    break;

                case 3:
                    cetakHeaderTabel();
                    for (Peminjaman p : daftarPinjam) p.tampilPeminjaman();
                    break;

                case 4:
                    // (belum dimodif di nomor 1)
                    break;

                case 5:
                    // (belum dimodif di nomor 1)
                    break;
            }

        } while (pilihan != 0);
    }

    public static void cetakHeaderTabel() {
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-10s | %-10s | %-15s | %-10s | %-10s | %-10s\n",
                "NIM", "Nama", "Judul", "Lama", "Terlambat", "Denda");
        System.out.println("--------------------------------------------------------------");
    }
}