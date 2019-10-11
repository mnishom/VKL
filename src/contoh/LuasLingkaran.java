package contoh;

import java.util.List;

/**
 *
 * @author nishom
 */
public class LuasLingkaran {
    public static void main(String[] args) {
        //deklarasi variabel jari2 dan luas
        int jari2;
        double luas;
        
        //konstanta PI
        final double PI = 3.14159;
        //inisialisasi nilai pada variabel jari2
        jari2 = 7;

        //menghitung luas lingkaran
        luas = PI * Math.pow(jari2, 2);
        
        System.out.println("Luas Lingkaran = "+luas);        
    }
}
