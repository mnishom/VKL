package contoh.c;

public class Konstanta {
    public static void main(String[] args) {
        double PI = 3.14; //variabel biasa
        PI = 2.14;
        
        final double PHI = 3.14; //konstanta
        
        //Status s = new Status();
        
        int status = 0;
        
        switch (status) {
        //kode program
            case Status.PLAY:
                break;
        //
            case Status.PAUSE:
                break;
            case Status.STOP:
                break;
            case Status.NEXT:
                break;
            case Status.PREV:
                break;
            default:
                break;
        }
        
        //literal
        //integer
        int n77 = 77;
        int n77H = 0x4D;
        int n77O = 0115;
        
        //floating-point
        double d = 0.5;
        double e = .5;
        double f = 15f;
        double g = 15d;
        double h = 1.567e11;
        double i = 1.567e-11;
        double j = 1.567e+11;
        
        //boolean 
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = 1*4 > 2;
        
        //character
        char c1 = '\u2192';
        char c2 = '\'';
        char c3 = '\"';
        
        String s1 = "";
        System.out.println("A");
        System.out.println("A"
                + "B".concat("123")
                + "C"
                + "D"+h); 
        
    }
}
