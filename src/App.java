public class App {
    public static void main(String[] args) throws Exception {
        faiFunzione("ciao"); 
        faiFunzione("ciao2"); 
        int risultato = addizione(5, 3);
        System.out.println(risultato);
        int sottrazione = sottrazione(2, 1);
        int sottrazione2 = sottrazione(2, 1, 1);
        double sottrazione3 = sottrazione(2.2, 1.1);
    }

    static void faiFunzione(String cosa){
        System.out.println("stampa " + cosa);
    }

    static int addizione(int a, int b){
        int risultato = a + b;
        System.out.println(risultato);
        return risultato;
    }

    static int sottrazione(int a, int b){
        int risultato = a - b;
        return risultato;
    }
    static int sottrazione(int a, int b, int c){
        int risultato = a - b;
        return risultato;
    }
    static double sottrazione(double a, double b){
        double risultato = a - b;
        return risultato;
    }

}
