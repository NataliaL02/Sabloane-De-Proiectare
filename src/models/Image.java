package models;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class Image implements Element, Picture {
    private final String url;
    private final List<Element> listaImagini;

    public Image(String url) {
        this.listaImagini = new ArrayList<>();
        this.url = url;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + url);
    }

    @Override
    public void add(Element element) {
        listaImagini.add(element);
    }

    @Override
    public void remove(Element element) {
        listaImagini.remove(element);
    }

    @Override
    public Element get(int indexulElementului) {
        return listaImagini.get(indexulElementului);
    }

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }

    @Override
    public PictureContent content() {
        return null;
    }
}