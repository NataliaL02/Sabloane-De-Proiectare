package visitor;

import models.*;

public class BookStatistics implements Visitator {
    int nrImagini, nrTabele, nrParagrafe;

    @Override
    public void visitElement(Element element) {

    }

    @Override
    public void visitBook(Book bookObject) {

    }

    @Override
    public void visitSection(Section sectionObject) {

    }

    @Override
    public void visitParagrapf(Paragraph paragraphObject) {
        nrParagrafe += 1;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        nrImagini += 1;
    }

    @Override
    public void visitImage(Image imageObject) {
        nrImagini += 1;
    }

    @Override
    public void visitTable(Table tableObject) {
        nrTabele += 1;
    }

    @Override
    public void visitTableOfContents(TableOfContents tableOfContents) {

    }

    @Override
    public void printStatistics() {
        System.out.println("Book Statistics:");
        System.out.println("*** Number of images: " + nrImagini);
        System.out.println("*** Number of tables: " + nrTabele);
        System.out.println("*** Number of paragraphs: " + nrParagrafe);
    }
}
