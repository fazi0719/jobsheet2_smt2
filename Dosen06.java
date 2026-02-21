public class Dosen06 {
    // Atribut
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    // Method untuk menampilkan informasi dosen
    void tampilkanInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
       System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }
    void setStatusAktif(boolean statusBaru) {
        this.statusAktif = statusBaru;
    }
    void hitungMasaKerja( int tahunSekarang) {
        int masaKerja = tahunSekarang - tahunBergabung;
        System.out.println("Masa Kerja Dosen: " + masaKerja + " tahun");
    }
    void ubahKeahlian(String bidangBaru) {
        this.bidangKeahlian = bidangBaru;
    }

    // Konstruktor default
    public Dosen06() {
    }

    // Konstruktor dengan parameter
    public Dosen06(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
}
