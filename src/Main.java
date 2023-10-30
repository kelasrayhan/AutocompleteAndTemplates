import java.util.Scanner;

/**
 * Dokumentasi :
 *
 * Ini adalah program kalkulator sederhana.
 *
 * @author Rayhan Rizky
 */

public class Main {

    int perkalian,penjumlahan,pengurangan,pembagian,modulo,pilih,hasil;
    Scanner input = new Scanner(System.in);

    /**
     * Method HitungPenjumlahan untuk menghitung input penjumlahan.
     */
    public void HitungPenjumlahan(){
        int a,b;
        System.out.println("Masukan nilai a : ");
        a = input.nextInt();
        System.out.println("Masukan nilai b : ");
        b = input.nextInt();

        hasil = a + b;

        System.out.println("Hasil : " + hasil);

    }
    /**
     * Method HitungPengurangan untuk menghitung input pengurangan.
     */
    public void HitungPengurangan(){
        int a,b;
        System.out.println("Masukan nilai a : ");
        a = input.nextInt();
        System.out.println("Masukan nilai b : ");
        b = input.nextInt();

        hasil = a - b;

        System.out.println("Hasil : " + hasil);
    }
    /**
     * Method HitungPembagian untuk menghitung input pembagian.
     */
    public void HitungPembagian(){
        int a,b;
        System.out.println("Masukan nilai a : ");
        a = input.nextInt();
        System.out.println("Masukan nilai b : ");
        b = input.nextInt();

        hasil = a / b;

        System.out.println("Hasil : " + hasil);
    }
    /**
     * Method HitungPerkalian untuk menghitung input perkalian.
     */
    public void HitungPerkalian(){
        int a,b;
        System.out.println("Masukan nilai a : ");
        a = input.nextInt();
        System.out.println("Masukan nilai b : ");
        b = input.nextInt();

        hasil = a * b;

        System.out.println("Hasil : " + hasil);
    }

    /**
     * Method HitungModulo untuk menghitung input Modulo.
     */
    public void HitungModulo(){
        int a,b;
        System.out.println("Masukan nilai a : ");
        a = input.nextInt();
        System.out.println("Masukan nilai b : ");
        b = input.nextInt();

        hasil = a % b;

        System.out.println("Hasil : " + hasil);
    }

    /**
     * Method Display untuk menampilkan awalan output.
     */
    public void Display(){
        System.out.println("Program Kalkulator Sederhana");
        System.out.println("Pilih");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Modulo");
        System.out.println("Pilih : ");
        pilih = input.nextInt();

        if (pilih == 1){
            HitungPenjumlahan();
        } else if (pilih == 2) {
            HitungPengurangan();
        } else if (pilih == 3) {
            HitungPerkalian();
        } else if (pilih == 4 ) {
            HitungPembagian();
        } else if (pilih == 5) {
            HitungModulo();
        }else {
            System.out.println("Maaf Inputan Tidak Sesuai! :) ");
            Display();
        }

    }


    /**
     *
     * @param args method ini berfungsi untuk menjalankan program class Main.
     */
    public static void main(String[] args) {
        Main main = new Main();
        main.Display();
    }

}