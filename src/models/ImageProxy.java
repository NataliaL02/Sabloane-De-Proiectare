package models;

import java.awt.*;

public class ImageProxy implements Element, Picture {
    private final String url;
    private int dim;
    private Image imagine;

    public ImageProxy(String url) {
        this.url = url;
    }

    public Image loadImage() {
        if (imagine == null) {
            imagine = new Image(url);
        }
        return imagine;
    }

    @Override
    public void print() {
        loadImage().print();
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
    public String url() {
        return url;
    }

    @Override
    public Dimension dim() {
        return new Dimension(dim, dim);
    }

    @Override
    public PictureContent content() {
        return null;
    }
}