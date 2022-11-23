import models.*;


public interface Visitator{
     void visitBook(Book bookObject);
     void visitSection(Section sectionObject);
     void visitParagrapf(Paragraph paragraphObject);
     void visitImageProxy(ImageProxy imageProxy);
     void visitImage(Image imageObject);
     void visitTable(Table tableObject);
    /* void  visitTable OfContents (TableOfContents tableOfContents); */


}
