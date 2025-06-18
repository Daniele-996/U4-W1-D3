package esTwo;

import java.util.Arrays;

public class SimTelefono {

    private int numeroTel;
    private int creditoResiduo;
    private Chiamata[] chiamate = new Chiamata[5];


    public SimTelefono(Chiamata[] chiamate) {
        this.chiamate = chiamate;
    }

    public int getNumeroTel() {
        return numeroTel;
    }

    public int getCreditoResiduo() {
        return creditoResiduo;
    }

    @Override
    public String toString() {
        return "SimTelefono{" +
                "chiamate=" + Arrays.toString(chiamate) +
                '}';
    }

    public Chiamata[] getChiamate() {
        return chiamate;
    }
}
