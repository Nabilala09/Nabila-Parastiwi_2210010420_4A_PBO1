package uasvideo;

// inheritance
public class PerhiasanDetail extends Perhiasan {
    // konstruktor
    public PerhiasanDetail(String nama, String kode) {
        super(nama, kode); // Memanggil 
    }

    public int getTahunProduksi() {
        return Integer.parseInt(getKode().substring(0, 2)) + 2000; // Mendapatkan tahun produksi dari kode perhiasan
    }

    public String getJenisLogam() {
        String kodeLogam = getKode().substring(2, 4); // Mendapatkan kode logam 
        // seleksi if
        if (kodeLogam.equals("01")) {
            return "Emas"; 
        } else if (kodeLogam.equals("02")) {
            return "Perak"; 
        } else {
            return "Logam lain"; 
        }
    }

    public String getDesain() {
        String kodeDesain = getKode().substring(4, 6); // Mendapatkan kode desain 
        // seleksi switch
        switch (kodeDesain) {
            case "01":
                return "Cincin"; 
            case "02":
                return "Kalung"; 
            default:
                return "Desain lain"; 
        }
    }

    public int getNoSeri() {
        return Integer.parseInt(getKode().substring(6)); // Mendapatkan nomor seri 
    }

    // polimorfisme overriding // Menampilkan informasi lengkap perhiasan
    @Override
    public String displayInfo() {
        return super.displayInfo() +
               "\nTahun Produksi: " + getTahunProduksi() +
               "\nJenis Logam: " + getJenisLogam() +
               "\nDesain: " + getDesain() +
               "\nNo Seri: " + getNoSeri(); 
    }
}


