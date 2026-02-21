public class MataKuliahMain06 {
    public static void main(String[] args) {

        //objek 1 
        MataKuliah06 mk1 = new MataKuliah06();
        mk1.kodeMK = "SI546";
        mk1.nama = "Algoritma dan Pemrograman";
        mk1.sks = 3;
        mk1.jumlahJam = 4;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.tampilkanInformasi();
        System.out.println("\n"); // Memisahkan output objek 1 dan objek 2

        //objek 2
        MataKuliah06 mk2 = new MataKuliah06("SI456", "Basis Data", 3, 3);
        mk2.kurangiJam(1);
        mk2.tampilkanInformasi();
    }
    
}
