public class DosenMain {
    public static void main(String[] args) {
        // objek 1
        Dosen06 dosen1 = new Dosen06();
        dosen1.idDosen = "B002";
        dosen1.nama = "Dr. Budi Santoso";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2009;
        dosen1.bidangKeahlian = "Algoritma dan Pemrograman";

        dosen1.tampilkanInformasi();
        dosen1.setStatusAktif(true);
        dosen1.hitungMasaKerja(2024);
        dosen1.ubahKeahlian("Struktur Data");
        dosen1.tampilkanInformasi();
        System.out.println("\n"); // memisahkan output

        // objek 2
        Dosen06 dosen2 = new Dosen06("B002", "Dr. Siti Aminah", true, 2015, "Basis Data");
        dosen2.tampilkanInformasi();
        System.out.println("\n");
        dosen2.ubahKeahlian("Struktur Data");
        dosen2.tampilkanInformasi();
    }
    
}
