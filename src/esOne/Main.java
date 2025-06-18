package esOne;

import static esOne.Rettangolo.stampaDueRettangoli;
import static esOne.Rettangolo.stampaRettangolo;

public class Main {
    public static void main(String[] args) {
        Rettangolo firstRett = new Rettangolo(10, 20);
        System.out.println(firstRett.getAltezza());
        System.out.println(firstRett.getLarghezza());
        firstRett.getPerimetro();
        firstRett.getArea();

        Rettangolo secondRett = new Rettangolo(25, 100);
        System.out.println(secondRett.getAltezza());
        System.out.println(secondRett.getLarghezza());
        secondRett.getPerimetro();
        secondRett.getArea();

        stampaRettangolo();
        stampaRettangolo();
        stampaDueRettangoli(firstRett, secondRett);
    }
}