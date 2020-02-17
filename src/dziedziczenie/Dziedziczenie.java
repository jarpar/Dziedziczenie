package dziedziczenie;

import dziedziczenie.potwory.Potwor;
import dziedziczenie.potwory.Szkielet;
import dziedziczenie.potwory.Zombie;

public class Dziedziczenie {
    public static void main(String[] args) {

        Potwor p = new Potwor(10, 100);
        System.out.println(p);

        Szkielet s = new Szkielet(20, 50, "Łuk");
        System.out.println(s);

        Zombie z = new Zombie();
        System.out.println(z);
    }
}

/*
/usr/lib/jvm/java-1.11.0-openjdk-amd64/bin/java -javaagent:/snap/intellij-idea-community/208/lib/idea_rt.jar=35413:/snap/intellij-idea-community/208/bin -Dfile.encoding=UTF-8 -classpath /home/user/IdeaProjects/Dziedziczenie/out/production/Dziedziczenie dziedziczenie.Dziedziczenie
Niedomyślny konstruktor z klasy Potwor
Potwor{predkoscChodzenia=10.0, zywotnosc=100.0}
Niedomyślny konstruktor z klasy Potwor
Niedomyślny konstruktor z klasy Szkielet
Szkielet{typBroni='Łuk', predkoscChodzenia=20.0, zywotnosc=50.0}
Domyślny konstruktor z klasy Potwor
Domyślny konstruktor z klasy Zombie
Zombie{predkoscChodzenia=10.0, zywotnosc=0.0}

Process finished with exit code 0
 */
