package esTwo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Chiamata primaChiamata = new Chiamata(160, 333454415);
        System.out.println(primaChiamata.getDurata());
        System.out.println(primaChiamata.getNumero());

        Chiamata secondaChiamata = new Chiamata(258, 324556987);
        System.out.println(secondaChiamata.getDurata());
        System.out.println(secondaChiamata.getNumero());

        Chiamata terzaChiamata = new Chiamata(456, 326455897);
        System.out.println(terzaChiamata.getDurata());
        System.out.println(terzaChiamata.getNumero());

        Chiamata quartaChiamata = new Chiamata(123, 329554682);
        System.out.println(quartaChiamata.getDurata());
        System.out.println(quartaChiamata.getNumero());

        Chiamata quintaChiamata = new Chiamata(234, 347526214);
        System.out.println(quintaChiamata.getDurata());
        System.out.println(quintaChiamata.getNumero());

        Chiamata[] chiamate = new Chiamata[5];
        chiamate[0] = primaChiamata;
        chiamate[1] = secondaChiamata;
        chiamate[2] = terzaChiamata;
        chiamate[3] = quartaChiamata;
        chiamate[4] = quintaChiamata;

        System.out.println(Arrays.toString(chiamate));
    }

}
