package pbo2.pkg10119073.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menampilkan formatting
 * kalimat menjadi huruf besar dan kecil
 *
 */

public class PBO210119073Latihan27HurufBesarKecil {

    public static void main(String[] args) {
        String kalimat;
        String hurufbesar;
        String hurufkecil;
        
        System.out.print("Masukkan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        kalimat = scanner.nextLine();
        hurufbesar = kalimat.toUpperCase();
        hurufkecil = kalimat.toLowerCase();
        
        System.out.println();
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " +hurufbesar);
        System.out.println("Huruf Kecil : " +hurufkecil);
    }
    
}