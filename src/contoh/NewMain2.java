package contoh;

import java.util.Scanner;

public class NewMain2 {

    public static void main(String[] args) {
        char nilai = 0;
        Scanner input = new Scanner(System.in);
        char value = input.next().charAt(0); 
        String hasilNilai;
        switch (value) {
            case 'E':
                hasilNilai = "0-35";
                break;
            case 'D':
                hasilNilai = "36-55";
                break;
            case 'C':
                hasilNilai = "56-65";
                break;
            case 'B':
                hasilNilai = "66-79";
                break;
            case 'A':
                hasilNilai = "80-100";
                break;
            default:
                hasilNilai = "Inputan tidak sesuai";
                break;
        }
        System.out.println(""+hasilNilai);
    }
    
}
