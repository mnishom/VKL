package contoh.a;

import java.util.Scanner;

public class ContohKonstanta {
    public static void main(String[] args) {
//        final double PI = 3.14;
//        final String a = "a";
//        
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("Ketik angka [1-4]: ");
            int n = s.nextInt();  
            switch (n) {
                case MyConstant.PLAY:
                    break;
                case MyConstant.PAUSE:
                    break;
                case MyConstant.NEXT:
                    break;
                case MyConstant.PREV:
                    break;
                default:
                    break;
            }
            
            int count1 = 77; //dec (ASCII)
            int count2 = 0x4D; //hexa
            int count3 = 0115; //octal
            System.out.println(count1);
            System.out.println(count2);
            System.out.println(count3);
            
            double decimalNumber = 5.0; 
            decimalNumber = .5; 
            decimalNumber = 5; 
            decimalNumber = 5d; 
            decimalNumber = 0.5; 
            decimalNumber = 10f;
            decimalNumber = 3.14159e0; 
            decimalNumber = 2.718281828459045D; 
            decimalNumber = 1.0e-6D; 
            
            boolean play = true;
            boolean stop = false;
            boolean pause = play==true && stop ==false;
            
            char ch = '\"'; //literal char
            String str = "A"
                    + "\nB"
                    + "\nC"
                    + "\nD"
                    + "E"
                    + "F"
                    + "G"
                    + "H"
                    + "I"
                    + "J"
                    + "K"
                    + "L"+decimalNumber;
            if(str instanceof String){
                System.out.println(str);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
