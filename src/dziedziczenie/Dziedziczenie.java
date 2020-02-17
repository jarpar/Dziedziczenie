package dziedziczenie;

import dziedziczenie.potwory.Potwor;
import dziedziczenie.potwory.Szkielet;
import dziedziczenie.potwory.Zombie;

public class Dziedziczenie {
    public static void main(String[] args) {

        Potwor p = new Szkielet(25, 36, "miecz");
        System.out.println(p);

//        Potwor ps = new Szkielet(10, 100);
//        ps.atakuj();
//        System.out.println("####");
//
//        Potwor pz = new Zombie();
//        pz.atakuj();
//        System.out.println("####");
//
//        specialAttack(ps, pz);

//       Potwor p = new Potwor(10, 100);
//        System.out.println(p);
//
//        Szkielet s = new Szkielet(20, 50, "Łuk");
//        System.out.println(s);
//        s.atakuj();
//
//        Zombie z = new Zombie();
//        System.out.println(z);
    }

//    static void specialAttack(Potwor potwor1, Potwor potwor2) {
//        potwor1.atakuj();
//        potwor2.atakuj();
//    }
}
