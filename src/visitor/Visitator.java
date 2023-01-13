package visitor;

import models.*;


public interface Visitator {
    void visitElement(Element element);

    void visitBook(Book bookObject);

    void visitSection(Section sectionObject);

    void visitParagrapf(Paragraph paragraphObject);

    void visitImageProxy(ImageProxy imageProxy);

    void visitImage(Image imageObject);

    void visitTable(Table tableObject);

    void visitTableOfContents(TableOfContents tableOfContents);

     void printStatistics();
}
