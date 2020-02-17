package dziedziczenie.potwory;

public class Szkielet extends Potwor {

    public void atakuj() {
        super.atakuj();//super czyli metoda ataku potwora
        /*
        tutaj dodać specyficzną dla szkieletu,
        dodatkową implementację ataku
         */
        System.out.println("To jest metoda atakuj z klasy Szkielet");
    }

    String typBroni;

    public Szkielet() {
        System.out.println("Domyślny konstruktor z klasy Szkielet");
    }

    public Szkielet(double predkoscChodzenia, double zywotnosc) {
        super(predkoscChodzenia, zywotnosc);
    }

    public Szkielet(double predkoscChodzenia, double zywotnosc, String typBroni) {
//        this.predkoscChodzenia = predkoscChodzenia;
//        this.zywotnosc = zywotnosc;
        super(predkoscChodzenia, zywotnosc);
        this.typBroni = typBroni;
        System.out.println("Niedomyślny konstruktor z klasy Szkielet");
    }

    @Override
    public String toString() {
        return "Szkielet{" +
                "typBroni='" + typBroni + '\'' +
                ", predkoscChodzenia=" + predkoscChodzenia +
                ", zywotnosc=" + zywotnosc +
                '}';
    }
}
