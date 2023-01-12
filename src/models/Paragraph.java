package models;

import services.AlignCenter;
import services.AlignLeft;
import services.AlignRight;
import services.AlignStrategy;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements Element {
    private final String paragraphName;
    private final List<Element> listOfElements;
    private AlignStrategy alignStrategy;

    public Paragraph(String paragraphName) {
        this.paragraphName = paragraphName;
        this.listOfElements = new ArrayList<>();
        alignStrategy = null;
    }

    @Override
    public void add(Element elementObject) {
        listOfElements.add(elementObject);
    }

    @Override
    public void remove(Element elementObject) {
        listOfElements.remove(elementObject);
    }

    @Override
    public Element get(int indexOfElement) {
        return listOfElements.get(indexOfElement);
    }

    public void print() {
        if (alignStrategy != null) {
            alignStrategy.render(this);
        } else {
            System.out.println(paragraphName);
        }
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    public String getParagraphName() {
        return paragraphName;
    }
}