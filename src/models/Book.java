package models;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
public class Book extends Section {
    private final List<String> elementeleListei;
    private final List<Element> listaElemente;
    private final List<Author> listaAutori;

    public Book(String titlulCartii) {
        super(titlulCartii);
        this.elementeleListei = new ArrayList<>();
        this.listaElemente = new ArrayList<>();
        this.listaAutori = new ArrayList<>();
    }


    public void addAuthor(Author autorul) {
        listaAutori.add(autorul);
    }

    public void addContent(Element element) {
        listaElemente.add(element);
    }

    public void print() {
        System.out.println("Book: " + numeleSectiunii + "\n");
        System.out.println("Authors: ");
        for (Author author : listaAutori) {
            author.print();
        }
        System.out.println();
        for (Element element : listaElemente) {
            element.print();
        }
    }
}