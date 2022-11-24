package test;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Element {
    private final String nume;
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    private final List<Element> lista;

    public Restaurant(String nume) {
        this.nume = nume;
        lista = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void add(Element obiect) {
        lista.add(obiect);
    }
}