package oop.labor07.labor7_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dokumentum {
    private static int id=0;
    private String nev;
    private MyDate datum;
    private int azonosito;
    private StringBuffer tartalom;

    public Dokumentum(String nev, MyDate datum) {
        this.nev = nev;
        this.datum = datum;
        id++;
        this.azonosito=id;
        this.tartalom = new StringBuffer();

    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getAzonosito() {
        return azonosito;
    }

    public String getNev() {
        return nev;
    }

    public MyDate getDatum() {
        return datum;
    }

    public String getTartalom() {
        return tartalom.toString();
    }
    public void tartalomHozzafuz(String ujtartalom){
        tartalom.append(ujtartalom);
    }
    public boolean isEmpty(){
        String szoveg = tartalom.toString();
        return szoveg.isEmpty();
    }
    public int numRows(){
        int db=0;
        String szoveg = tartalom.toString();
        if(szoveg.isEmpty()) return 0;
        else db=1;
        for (int i = 0; i < szoveg.length(); i++) {
            if (szoveg.charAt(i) == '\n') {
                db++;
            }
        }
        return db;
    }

    public Dokumentum(String nev, MyDate datum, String filenev) {
        this.nev = nev;
        this.datum = datum;

        id++;
        this.azonosito = id;

        this.tartalom = new StringBuffer();

        try (Scanner scanner = new Scanner(new File(filenev))) {
            while (scanner.hasNextLine()) {
                this.tartalom.append(scanner.nextLine());
                this.tartalom.append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Dokumentum{" +
                "nev='" + nev + '\'' +
                ", datum=" + datum +
                ", azonosito=" + azonosito +
                ", tartalom=" + tartalom +
                ",sorok szama = "+numRows() +
                '}';
    }

}
