package oop.labor07.labor7_1;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {

        // 1. Dokumentum létrehozása 2 paraméteres konstruktorral
        Dokumentum doc1 = new Dokumentum("Java", new MyDate(2, 11, 2025));

        // 2. Tartalom hozzáfűzése (2 sor)
        doc1.tartalomHozzafuz("Első sor a dokumentumban.\nMásodik sor a dokumentumban.\nHarmadik sor a dokumentumban.");
        //doc1.tartalomHozzafuz("Második sor a dokumentumban.\n");

        // 3. Tartalom kiírása standard kimenetre
        System.out.println("Doc1 tartalom (2 sor):");
        System.out.println(doc1.getTartalom());

        // 4. Harmadik sor hozzáfűzése
        //doc1.tartalomHozzafuz("Harmadik sor a dokumentumban.");

        // 5. Dokumentum kiírása fájlba (név.txt)
        printDocumentToFile(doc1);

        // 6. Dokumentum kiírása toString-el
        System.out.println("Doc1 állapota (toString):");
        System.out.println(doc1);

        // 7. Második dokumentum létrehozása 3 paraméteres konstruktorral
        Dokumentum doc2 = new Dokumentum("HTML", new MyDate(2, 11, 2025), "be.txt");

        // 8. Tartalom kiíratása standard kimenetre
        System.out.println("Doc2 tartalom:");
        System.out.println(doc2.getTartalom());

        // 9. Repository létrehozása

        Dokumentum doc3 = new Dokumentum("CSS",new MyDate(2,10,2026));
        Repository rep1 = new Repository();
        rep1.newDocument(doc1);
        rep1.newDocument(doc2);
        rep1.newDocument(doc3);
        for (int i = 0; i < rep1.documents.size(); i++) {
            if (rep1.documents.get(i).getAzonosito()==3) System.out.println(rep1.documents.get(i));
        }
        Dokumentum doc4 = new Dokumentum("JAVASCRIPT",new MyDate(3,2,2024));
        rep1.newDocument(doc4);
        System.out.println(rep1.isEmptyDb());
    }

    private static void printDocument(PrintStream ps, Dokumentum doc) {
        ps.println("Azonosító: " + doc.getAzonosito());
        ps.println("Név: " + doc.getNev());
        ps.println("Dátum: " + doc.getDatum());
        ps.println("Tartalom:\n" + doc.getTartalom());
    }

    public static void printDocumentToFile(Dokumentum doc) {
        String filename = doc.getNev() + ".txt";
        try (PrintStream out = new PrintStream(filename)) {
            printDocument(out, doc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}