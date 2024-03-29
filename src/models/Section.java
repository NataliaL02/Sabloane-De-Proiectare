package models;

import visitor.Visitator;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    protected final String numeleSectiunii;
    private final List<Element> listaSectiuni;

    public Section(String numeleSectiunii) {
        this.numeleSectiunii = numeleSectiunii;
        this.listaSectiuni = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println(numeleSectiunii);
        for (Element element : listaSectiuni) {
            element.print();
        }

    }

    @Override
    public void add(Element element) {
        listaSectiuni.add(element);
    }

    @Override
    public void remove(Element element) {
        listaSectiuni.remove(element);

    }

    @Override
    public Element get(int indexulElementului) {
        return listaSectiuni.get(indexulElementului);
    }

    @Override
    public void accept(Visitator visitor) {
        visitor.visitSection(this);
        for (Element element : listaSectiuni) {
            element.accept(visitor);
        }
    }
}