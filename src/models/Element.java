package models;

import visitor.Visitee;

@SuppressWarnings("unused")
public interface Element extends Visitee {
    void print();

    void add(Element element);

    void remove(Element element);

    Element get(int indexulElementului);
}