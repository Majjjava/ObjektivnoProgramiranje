public class Izpit {

    //objektne spremenljivke
    String sifra;
    double stTock;
    boolean opravil;

    //staticna spremenljivka
    static double minStTock=14.0;

    //osnovni konstruktor
    Izpit(){
        this.sifra="12345";
        this.stTock=0;
        this.opravil=false;
    }
    //kostruktor
    Izpit(String s, double st){
        this.sifra=s;
        this.stTock=st;
        this.opravil=false;
    }
    //objektna metoda
    void izpisTockKandidata(){
        System.out.println("Sifra kandidata: "+this.sifra+"Tocke: "+this.stTock);
    }
    //staticna metoda
    static void izpisKriterija(){
        System.out.println("Za pozitivno oceno je potrebnih "+minStTock+"tock");
    }
}
