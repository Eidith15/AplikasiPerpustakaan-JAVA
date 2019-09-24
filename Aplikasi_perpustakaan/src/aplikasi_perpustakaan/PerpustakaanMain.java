/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_perpustakaan;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PerpustakaanMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();
        Perpustakaan pus = new Perpustakaan();
        Dosen dos = new Dosen();
        int pilih;

        System.out.println("Maksimal Peminjaman Hanya 3 Hari");
        System.out.println("TIPE PEMINJAM");
        System.out.println("1. Dosen");
        System.out.println("2. Mahasiswa");
        System.out.println("Pilih tipe Peminjam	:");

        pilih = sc.nextInt();

        if (pilih == 1) {
            System.out.print("Nama Dosen : ");
            dos.setNamaDosen(sc.next());
            System.out.print("No Peminjaman Dosen : ");
            dos.setNoPinjamDosen(sc.next());
            System.out.print("Jumlah Buku Dipinjam : ");
            pus.setJumlahBuku(sc.nextInt());
            System.out.print("Lama Peminjaman : ");
            pus.setLamaPinjam(sc.nextInt());
            pus.pinjamanDosen();
            System.out.println(" ");
        } else if (pilih == 2) {
            System.out.print("Nama Mahasiswa : ");
            mhs.setNamaMahasiswa(sc.next());
            System.out.print("No Peminjaman Mahasiswa : ");
            mhs.setNoPinjamMahasiswa(sc.next());
            System.out.print("Jumlah Buku Dipinjam : ");
            pus.setJumlahBuku(sc.nextInt());
            System.out.print("Lama Peminjaman : ");
            pus.setLamaPinjam(sc.nextInt());
            pus.pinjamanMahasiswa();
        } else {
            System.out.println("Menu Tidak Tersedia ");
        }
    }

}
