package test;

import java.util.ArrayList;
import java.util.List;

public class Subcomanda implements Element {
    private final String id;
    private final List<Element> lista;

    public Subcomanda(String id) {
        this.id = id;
        this.lista = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public List<Element> getLista() {
        return lista;
    }

    @Override
    public void add(Element obiect) {
        lista.add(obiect);
    }
}