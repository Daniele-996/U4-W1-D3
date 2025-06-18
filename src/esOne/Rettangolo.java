package esOne;

public class Rettangolo {

    private static int altezza;
    private static int larghezza;

    public Rettangolo(int alt, int larg) {
        altezza = alt;
        larghezza = larg;
    }

    public static void stampaDueRettangoli(Rettangolo rett1, Rettangolo rett2) {
        System.out.println("L'area del primo è : " + getArea());
        System.out.println("Il perimetro del primo è : " + getPerimetro());

        System.out.println("L'area del secondo è : " + getArea());
        System.out.println("Il perimetro del secondo è : " + getPerimetro());

        int sommaAree = getArea() + getArea();
        int sommaPerimetri = getPerimetro() + getPerimetro();
        System.out.println("La somma delle aree è : " + sommaAree);
        System.out.println("La somma dei perimetri è : " + sommaPerimetri);
    }

    public static void stampaRettangolo() {
        System.out.println("Il perimetro è : " + getPerimetro() + " e l'area è : " + getArea());
    }

    public static int getPerimetro() {
        return (altezza * 2) + (larghezza * 2);
    }

    public static int getArea() {
        return altezza * larghezza;
    }

    public int setAltezza(int altezza) {
        return altezza;
    }

    public int setLarghezza(int larghezza) {
        return larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public int getLarghezza() {
        return larghezza;
    }
}
