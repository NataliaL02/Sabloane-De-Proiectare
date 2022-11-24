package test;

@SuppressWarnings("unused")
public abstract class Produs implements Element {
    protected final String nume;
    protected double pret;

    public Produs(String nume, double produs) {
        this.nume = nume;
        this.pret = produs;
    }

    public String getNume() {
        return nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }
}