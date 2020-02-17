package dziedziczenie.potwory;

public class Potwor {
    public double predkoscChodzenia = 10;
    public double zywotnosc;

    public void atakuj() {
        /*
        domyślna implementacja ataku
         */
        System.out.println("To jest metoda atakuj z klasy Potwor");
    }

    public Potwor() {
        System.out.println("Domyślny konstruktor z klasy Potwor");
    }

    public Potwor(double predkoscChodzenia, double zywotnosc) {
        this.predkoscChodzenia = predkoscChodzenia;
        this.zywotnosc = zywotnosc;
        System.out.println("Niedomyślny konstruktor z klasy Potwor");
    }

    @Override
    public String toString() {
        return "Potwor{" +
                "predkoscChodzenia=" + predkoscChodzenia +
                ", zywotnosc=" + zywotnosc +
                '}';
    }
}
