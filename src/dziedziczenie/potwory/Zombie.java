package dziedziczenie.potwory;

public class Zombie extends Potwor {
    @Override
    protected void opis() {

    }

    public Zombie() {
        System.out.println("Domyślny konstruktor z klasy Zombie");
    }

    @Override
    public String toString() {
        return "Zombie{" +
                "predkoscChodzenia=" + predkoscChodzenia +
                ", zywotnosc=" + zywotnosc +
                '}';
    }
}
