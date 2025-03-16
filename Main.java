public class Main {
    public static void main(String[] args) {
        PengirimanBarang.displayInfoLogistik();

        PengirimanBarang paket1 = new PengirimanBarang();
        paket1.displayInfo();

        System.out.println("\n---\n");
        
        PengirimanBarang paket2 = new PengirimanBarang("Domiia", "Makassar", 2.0, 150000);
        paket2.displayInfo();

        System.out.println("\nBiaya setelah diskon 10%: Rp " + paket2.hitungOngkir(10));
        System.out.println("Biaya setelah diskon 10% + asuransi Rp 5000: Rp " + paket2.hitungOngkir(10, 5000));
        System.out.println("Biaya berdasarkan jarak 60 km: Rp " + paket2.hitungOngkir(60));
        System.out.println("Biaya berdasarkan jarak 40 km: Rp " + paket2.hitungOngkir(40));
    }
}
