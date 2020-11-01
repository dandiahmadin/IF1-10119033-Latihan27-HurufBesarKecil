/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119033.latihan27.hurufbesarkecil;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi formating huruf menjadi kapital dan kecil
 */
public class IF110119033Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    
    static String kalimat;
    
    static void inputKalimat() {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Masukan Kalimat : ");
        kalimat = scanner.nextLine();
    }
    
    static String hurufKapital(String paramKapital) {
        return paramKapital.toUpperCase();
    }
    
    static String hurufKecil(String paramKecil) {
        return paramKecil.toLowerCase();
    }
    
    static void tampilHasil() {
        System.out.println("=====Hasil Formating=====");
        System.out.println("Huruf Besar : ".concat(hurufKapital(kalimat)));
        System.out.println("Huruf Kecil : ".concat(hurufKecil(kalimat)));
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        inputKalimat();
        tampilHasil();
    }
    
}
