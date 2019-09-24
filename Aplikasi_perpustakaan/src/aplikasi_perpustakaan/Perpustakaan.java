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
public class Perpustakaan {

    private String namaPeminjam;
    private int jumlahBuku;
    private int lamaPinjam;
    private int denda;
    int input;

    public int getDenda() {
        return denda;
    }

    public void setDenda(int denda) {
        this.denda = denda;
    }

    public int getJumlahBuku() {
        return jumlahBuku;
    }

    public void setJumlahBuku(int jumlahBuku) {
        this.jumlahBuku = jumlahBuku;
    }

    public int getLamaPinjam() {
        return lamaPinjam;
    }

    public void setLamaPinjam(int lamaPinjam) {
        this.lamaPinjam = lamaPinjam;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public void pinjamanDosen() {

        if (getLamaPinjam() > 3) {
            denda = 10000 * getJumlahBuku() * (getLamaPinjam() - 3);
            System.out.println("Denda Buku Untuk Dosen adalah Rp 10000/hari");
            System.out.println("Total Denda : Rp " + denda);
        } else {
            System.out.println("Tidak Ada Denda yang harus dibayar");
        }

    }

    public void pinjamanMahasiswa() {
        if (getLamaPinjam() > 3) {
            denda = 5000 * getJumlahBuku() * (getLamaPinjam() - 3);
            System.out.println("Denda Buku Untuk Mahasiswa adalah Rp 5000/hari");
            System.out.println("Total Denda : Rp " + denda);
        } else {
            System.out.println("Tidak Ada Denda yang harus dibayar");
        }
    }

}
