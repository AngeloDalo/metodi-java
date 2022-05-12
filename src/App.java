public class App {
    public static void main(String[] args) throws Exception {
        faiFunzione("ciao"); 
        faiFunzione("ciao2"); 
        int risultato = addizione(5, 3);
        System.out.println(risultato);
    }

    static void faiFunzione(String cosa){
        System.out.println("stampa " + cosa);
    }

    static int addizione(int a, int b){
        int risultato = a + b;
        System.out.println(risultato);
        return risultato;
    }

}
