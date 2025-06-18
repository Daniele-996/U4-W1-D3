package esTwo;

public final class Chiamata {
    private final int durata;
    private final int numero;

    public Chiamata(int durata, int numero) {
        this.durata = durata;
        this.numero = numero;
    }
    
    public int getDurata() {
        return durata;
    }

    public int getNumero() {
        return numero;
    }
}
