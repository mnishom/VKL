package contoh;


public class Test1 {
    public static void main(String[] args) {
        int n = 14;
        System.out.println("\u00A9 Copyright 2019 \n\u2192 Mulai");
        for (int i = 1; i <= n; i++) {
            if(i == n){
                System.out.println("\u00BB Antrian terakhir \u00AB");
            }
            System.out.println("Antrian ke: "+i);
            if (i % 3 == 0 && i<10) {
                System.out.print("\t \u2192 Tunggu sebentar...\n");
            }
        }
        System.out.println("\u2192 Selesai\n");
    }    
    
}
