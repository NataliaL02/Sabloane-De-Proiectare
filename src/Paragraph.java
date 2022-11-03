import java.util.ArrayList;
import java.util.List;

public class Paragraph implements Element {
    private final String numeleParagrafului;
    private final List<Element> listaParagrafe;

    public Paragraph(String numeleParagrafului) {
        this.numeleParagrafului = numeleParagrafului;
        this.listaParagrafe = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("Paragraph: " + numeleParagrafului);
    }

    @Override
    public void add(Element element) {
        listaParagrafe.add(element);
    }

    @Override
    public void remove(Element element) {
        listaParagrafe.remove(element);

    }

    @Override
    public Element get(int indexulElementului) {
        return listaParagrafe.get(indexulElementului);
    }
}