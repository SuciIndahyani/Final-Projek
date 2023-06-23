/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.project;

/**
 *
 * @author dell_6
 */
import java.util.Scanner;
public class santri{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Maksimal jumlah santri yang dapat didaftarkan
        final int MAX_SANTRI = 100;
        
        // Deklarasi array untuk menyimpan data santris
        String[] no = new String[MAX_SANTRI];
        String[] nama = new String[MAX_SANTRI];
        String[] nisn = new String[MAX_SANTRI];
        int jumlahSantri = 0;

        int pilihan;
        do {
            System.out.println("=== Pendaftaran Santri MTs Al-Huda ===");
            System.out.println("1. Tambah Santri");
            System.out.println("2. Cari Santri");
            System.out.println("3. Tampilkan Daftar Santri");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan No_Absen Santri: ");
                    String newNo_Absen = input.next();
                    System.out.print("Masukkan NISN Santri: ");
                    String newNISN = input.next();
                    System.out.print("Masukkan Nama Siswa: ");
                    String newNama = input.next();

                    // Menambahkan santri baru ke dalam array
                    no[jumlahSantri] = newNo_Absen;
                    nisn[jumlahSantri] = newNISN;
                    nama[jumlahSantri] = newNama;
                    jumlahSantri++;

                    System.out.println("Santri baru berhasil ditambahkan.");
                    break;

                case 2:
                    System.out.print("Masukkan NISN santri yang ingin dicari: ");
                    String searchNISN = input.next();

                    // Mencari santri berdasarkan NISN
                    boolean found = false;
                    for (int i = 0; i < jumlahSantri; i++) {
                        if (nisn[i].equals(searchNISN)) {
                            System.out.println("Santri ditemukan!");
                            System.out.println("No_Absen: " + no[i]);
                            System.out.println("NISN: " + nisn[i]);
                            System.out.println("Nama: " + nama[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Santri dengan NISN tersebut tidak ditemukan.");
                    }
                    break;

                case 3:
                    if (jumlahSantri > 0) {
                        System.out.println("Daftar Santri:");
                        for (int i = 0; i < jumlahSantri; i++) {
                            System.out.println("No_Absen: " + no[i]);
                            System.out.println("NIM: " + nisn[i]);
                            System.out.println("Nama: " + nama[i]);
                            System.out.println();
                        }
                    } else {
                        System.out.println("Belum ada santri yang terdaftar.");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            System.out.println();
        } while (pilihan != 4);

        input.close();
    }
}
