# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data Perhiasan menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan kode , dan memberikan output berupa informasi detail dari kode tersebut seperti tahun masuk, jenis Logam, dan desain.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Perhiasan`, `PerhiasanDetail`, dan `PerhiasanBeraksi` adalah contoh dari class.

```bash
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
}

public class PerhiasanDetailextends Perhiasan {
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
import java.util.Scanner;

public class PerhiasanBeraksi {
    public static void main(String[] args) {
        // error handling
        try {
            // IO sederhana
            Scanner scanner = new Scanner(System.in); // Membuat objek input

            // Array // Membuat array untuk menyimpan objek
            PerhiasanDetail[] perhiasan = new PerhiasanDetail[2]; 

            // perulangan biasa
            for (int i = 0; i < perhiasan.length; i++) {
                System.out.print("Masukkan Nama Perhiasan " + (i + 1) + ": ");
                String nama = scanner.nextLine(); // Membaca input
                System.out.print("Masukkan Kode Perhiasan " + (i + 1) + ": ");
                String kode = scanner.nextLine(); 

                // objek // Membuat objek PerhiasanDetail dengan data yang dibaca
                perhiasan[i] = new PerhiasanDetail(nama, kode); 
            }

            // perulangan array // Menampilkan informasi
            for (PerhiasanDetail data : perhiasan) {
                System.out.println("====================");
                System.out.println("Data Perhiasan: ");
                System.out.println(data.displayInfo()); 
            }
            // Menangani kesalahan
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan format nomor: " + e.getMessage()); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan format kode: " + e.getMessage()); 
        } catch (Exception e) {
            System.out.println("Kesalahan umum: " + e.getMessage()); 
        }
    }
}
}
```

2. **Object** adalah instance dari class. Pada kode ini, `perhiasan[i] = new PerhiasanDetail(nama, kode);` adalah contoh pembuatan object.

```bash
Perhiasan[i] = new PerhiasanDetail(nama, kode);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `kode` adalah contoh atribut.

```bash
String nama;
String kode;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Perhiasan` dan `PerhiasanDetail`.

```bash
public Perhiasan(String nama, String kode) {
    this.nama = nama;
    this.npm = kode;
}

public PerhiasanDetail(String nama, String kode) {
    super(nama, kode);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setKode` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void seKode(String kode) {
    this.npm = kode;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getkode`, `getTahunProduksi`, `getKodeLogam`, dan `getDesain` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getKode() {
    return kode;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `kode` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String kode;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PerhiasanDetail` mewarisi `Perhiasan` dengan sintaks `extends`.

```bash
public class PerhiasanDetail extends Perhiasan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Perhiasan` merupakan overloading method `displayInfo` dan `displayInfo` di `PerhiasanDetail` merupakan override dari method `displayInfo` di `Perhiasan`.

```bash
public String displayInfo(String kategori) {
    return displayInfo() + "\nkategori: " + kategori;
}

@Override
public String displayInfo() {
        return super.displayInfo() +
               "\nTahun Produksi: " + getTahunProduksi() +
               "\nJenis Logam: " + getJenisLogam() +
               "\nDesain: " + getDesain() +
               "\nNo Seri: " + getNoSeri(
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getKodeLogam` dan seleksi `switch` dalam method `getDesain`.

```bash
    public String getDesain() {
        String kodeDesain = getKode().substring(4, 6);
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

public String getKodeLogam() {
    switch(getKodeLogma().substring(4, 6)) {
        case "01":
            return "Emas";
        case "02":
            return "Perak";
        default:
            return "Logam lain";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < perhiasan.length; i++) {
                System.out.print("Masukkan Nama Perhiasan " + (i + 1) + ": ");
                String nama = scanner.nextLine(); // Membaca input
                System.out.print("Masukkan Kode Perhiasan " + (i + 1) + ": ");
                String kode = scanner.nextLine();
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Perhiasan :" + (i + 1) + ": ");
String nama = scanner.nextLine();
System.out.print("Masukkan Kode Perhiasan " + (i + 1) + ": ");
String kode = scanner.nextLine();

System.out.println("====================");
System.out.println("Data Perhiasan: ");
System.out.println(data.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `PerhiasanDetail[] perhiasan = new PerhiasanDetail[2];;` adalah contoh penggunaan array.

```bash
PerhiasanDetail[] perhiasan = new PerhiasanDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
    public static void main(String[] args) {
        // error handling
        try {
            Scanner scanner = new Scanner(System.in);
}
}
catch (NumberFormatException e) {
            System.out.println("Kesalahan format nomor: " + e.getMessage()); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan format kode: " + e.getMessage()); 
        } catch (Exception e) {
            System.out.println("Kesalahan umum: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Nabila Parastiwi
NPM: 2210010420
