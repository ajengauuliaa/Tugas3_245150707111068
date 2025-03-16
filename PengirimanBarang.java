class PengirimanBarang {
    String namaPengirim;
    String alamatTujuan;
    double berat;
    double biayaDasar;

    public PengirimanBarang(){
        this.namaPengirim = "";
        this.alamatTujuan = "";
        this.berat = 0.0;
        this.biayaDasar = 0.0;
    }

    public PengirimanBarang(String namaPengirim, String alamatTujuan, double berat, double biayaDasar){
        this.namaPengirim = namaPengirim;
        this.alamatTujuan = alamatTujuan;
        this.berat = berat;
        this.biayaDasar = biayaDasar;
    }

    public double hitungOngkir(double diskonPersen){
        return biayaDasar - (biayaDasar * diskonPersen / 100);
    }

    public double hitungOngkir(double diskonPersen, double biayaTambahan){
        return (biayaDasar - (biayaDasar * diskonPersen / 100)) + biayaTambahan;
    }

    public double hitungOngkir(int jarak) {
        if (jarak > 50){
            return biayaDasar + (biayaDasar * 0.10);
        } else {
            return biayaDasar - (biayaDasar * 0.05);
        }
    }

    public static void displayInfoLogistik(){
        System.out.println("Perusahaan Logistik KirimAja - Kirim Apa Saja, Ke Mana Saja");
    }

    public void displayInfo(){
        System.out.println("Nama Pengirim : " + namaPengirim);
        System.out.println("Alamat Tujuan : " + alamatTujuan);
        System.out.println("Berat Barang : " + berat + " kg");
        System.out.println("Biaya Dasar : Rp " + biayaDasar);
    }
}
