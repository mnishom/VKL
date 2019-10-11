package vkl;

/**
 *
 * @author nishom
 */
public class Methods {
    
    /**
     * <h1>Method ini digunakan untuk MOMENTUM [Persamaan Arus Listrik]</h1>
     * <h3>Rumus Persamaan Arus Listrik Adalah</h3>
     * <h5>[1] Untuk Mencari Kuat Arus Listrik Yaitu I = Q/t</h5>
     * <h5>[2] Untuk Mencari Besar Muatan Listrik Yaitu Q = I*t</h5>
     * <h5>[3] Untuk Mencari Selang Waktu Yaitu t = Q/I</h5>
     * @param I = Kuat Arus Listrik (Ampere = A)
     * @param Q = Besar Muatan Listrik (Coulomb = C)
     * @param t = Selang Waktu (Sekon = s)
     * @param ops = opsional [1=I, 2=Q, 3=t]
     * @return MOMENTUM => Arus Listrik
     */
    
    public static double get_ArusListrik(double I, double Q, double t, int ops){
        double ArusListrik = 0;
        switch (ops) {
            case Konstanta.AMPER:
                ArusListrik = Q/t;
                break;
            case Konstanta.COULOMB:
                ArusListrik = I*t; 
                break;
            case Konstanta.SEKON:
                ArusListrik = Q/I;
                break;
            default:
                break;
        }
        return ArusListrik;
    }
}
