public class MataKuliah06 {
    // Atribut
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    // method
    void tampilkanInformasi() {
        System.out.println("Kode mata kuliah: " + kodeMK);
        System.out.println("Nama mata kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }
    void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
    }
    void tambahJam(int jamBaru) {
        this.jumlahJam += jamBaru;
    }
    void kurangiJam(int jamKurang) {
        if (jamKurang <= jumlahJam) {
            this.jumlahJam -= jamKurang;
        } else {
            System.out.println("Jumlah jam yang dikurangi melebihi jumlah jam saat ini.");
        }
    }
        public MataKuliah06 () { //konstruktor default tanpa parameter
}
    public MataKuliah06 (String kodeMK, String nama, int sks, int jumlahJam) { //konstruktor berparameter
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}