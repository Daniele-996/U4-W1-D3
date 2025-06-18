package esOne;

public class Rettangolo {

    private final int altezza;
    private final int larghezza;

    public Rettangolo(int alt, int larg) {
        this.altezza = alt;
        this.larghezza = larg;
    }

    public int getAltezza() {
        return altezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public int getPerimetro() {
        return (this.altezza * 2) + (this.larghezza * 2);
    }

    public int getArea() {
        return this.altezza * this.larghezza;
    }

    public void stampaRettangolo() {
        System.out.println("Il perimetro è : " + getPerimetro() + " e l'area è : " + getArea());
    }

    public void stampaDueRettangoli(Rettangolo rett1, Rettangolo rett2) {
        System.out.println("L'area del primo è : " + rett1.getArea());
        System.out.println("Il perimetro del primo è : " + rett1.getPerimetro());

        System.out.println("L'area del secondo è : " + rett2.getArea());
        System.out.println("Il perimetro del secondo è : " + rett2.getPerimetro());

        int sommaAree = rett1.getArea() + rett2.getArea();
        int sommaPerimetri = rett1.getPerimetro() + rett2.getPerimetro();
        System.out.println("La somma delle aree è : " + sommaAree);
        System.out.println("La somma dei perimetri è : " + sommaPerimetri);
    }
}
