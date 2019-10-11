package kuis;

public class NewMain {
    public static void main(String[] args) {
        int n = 10;
        boolean x = false;
        System.out.println(""+(n>=5*2+1));
        if((n>=5*2+1) && n<11){
            System.out.println("Kuis Pertama");
            x = true;
        }
        if(x){
            System.out.println("Kuis kedeua");
        }
    }    
}
