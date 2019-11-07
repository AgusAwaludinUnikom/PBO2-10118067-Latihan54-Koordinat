/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan54.koordinat;

/**
 *
 * @author
 * NAMA : Agus Awaludin
 * NIM : 10118067
 * KELAS : PBO2
 * Latihan ini berisi tentang cara menampilkan koordinat warna dengan metode
 * polymorpism
 */
public class PBO210118067Latihan54Koordinat {

    public static String namaWarna;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat koordinat = new WarnaKoordinat(10, 4, "Jingga");
        namaWarna = koordinat.getNamaWarna();
        
        System.out.println("Warna Koordinat : "+ namaWarna);
        System.out.println("Koordinat Sumbu x : " + koordinat.x
                    +" y : "+ koordinat.y );
    }
    
}
