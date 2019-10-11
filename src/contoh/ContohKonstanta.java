package contoh;

import java.util.Scanner;

public class ContohKonstanta {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int operasi = s.nextInt();
        switch (operasi) {
            case Konstan.TAMBAH:
                System.out.println("Anda memilih rumus PENAMBAHAN");
                break;
            case Konstan.KURANG:
                System.out.println("Anda memilih operasi PENGURANGAN");
                break;
            case Konstan.BAGI:
                System.out.println("Anda memilih operasi PEMBAGIAN");
                break;
            case Konstan.KALI:
                System.out.println("Anda memilih operasi PERKALIAN");
                break;
            default:
                break;
        }
    }           
    class Konstan {
        public static final int TAMBAH = 1;
        public static final int BAGI = 2;
        public static final int KALI = 3;
        public static final int KURANG = 4;
    }
}
