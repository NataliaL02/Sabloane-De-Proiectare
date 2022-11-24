package test;

import java.util.ArrayList;
import java.util.List;

public class Comanda implements Element {
    private final String id;
    private final List<Element> lista;

    public Comanda(String id) {
        this.id = id;
        this.lista = new ArrayList<>();
    }

    @Override
    public void add(Element obiect) {
        lista.add(obiect);
    }

    public String getId() {
        return id;
    }

    public List<Element> getLista() {
        return lista;
    }
}