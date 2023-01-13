package models;

import visitor.Visitator;

@SuppressWarnings("unused")
public class TableOfContents implements Element {
    @Override
    public void print() {

    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int indexulElementului) {
        return null;
    }

    @Override
    public void accept(Visitator visitor) {
        visitor.visitTableOfContents(this);
    }
}
