package myTest;

public class Pdf {

    public static void main(String[] args) {

        PDFMergerUtility ut = new PDFMergerUtility();
        ut.addSource(...);
        ut.addSource(...);
        ut.addSource(...);
        ut.setDestinationFileName(...);
        ut.mergeDocuments();
    }
}
