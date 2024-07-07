package uasvideo;

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


