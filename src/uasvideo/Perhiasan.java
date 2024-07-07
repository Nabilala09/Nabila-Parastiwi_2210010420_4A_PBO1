package uasvideo;

public class Perhiasan {
    // atribut dan enkapsulasi
    private String nama; 
    private String kode; 

    // konstruktor // Inisialisasi
    public Perhiasan(String nama, String kode) {
        this.nama = nama; 
        this.kode = kode; 
    }

    // mutator // Mengubah
    public void setNama(String nama) {
        this.nama = nama; 
    }

    public void setKode(String kode) {
        this.kode = kode; 
    }

    // accessor // Mengambil
    public String getNama() {
        return nama; 
    }

    public String getKode() {
        return kode; 
    }

    // polimorfisme overloading // Menampilkan informasi
    public String displayInfo() {
        return "Nama: " + getNama() + "\nKode: " + getKode(); 
    }

    public String displayInfo(String kategori) {
        return displayInfo() + "\nKategori: " + kategori; 
    }
}



