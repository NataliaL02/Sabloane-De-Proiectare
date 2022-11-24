package test;

public class Main {
    public static void main(String[] args) {
        Element obiect1 = new Restaurant("Mc");
        Element obiect2 = new Comanda("Comanda 1");
        obiect2.add(new Burger("McPuisor", 6.99));
        obiect2.add(new Burger("BigMac", 24.5));
        Element obiect3 = new Subcomanda("Comanda 2");
        obiect3.add(new Burger("Cheeseburger", 20.0));
        obiect2.add(obiect3);
    }
}