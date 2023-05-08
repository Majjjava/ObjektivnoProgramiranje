public class IzpitTest {
    public static void main(String[] args) {
        Izpit student1 = new Izpit();
        System.out.println(student1.sifra);
        System.out.println();


        Izpit student2 = new Izpit("54321",19.0);
        System.out.println(student2.sifra);
        System.out.println(student2.stTock);   
        System.out.println(student2.opravil);
        student2.izpisTockKandidata();

        System.out.println(Izpit.minStTock);
        Izpit.minStTock = 15.0;
        Izpit.izpisKriterija();
 }
}