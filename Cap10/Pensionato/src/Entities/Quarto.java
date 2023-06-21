package Entities;

public class Quarto {

    private int numQuarto;
    private boolean vago;

    public Quarto(int numQuarto, boolean vago) {
        this.numQuarto = numQuarto;
        this.vago = vago;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

    public boolean isVago() {
        return vago;
    }

    public void setVago(boolean vago) {
        this.vago = vago;
    }
}
