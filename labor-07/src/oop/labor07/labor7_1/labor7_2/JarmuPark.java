package oop.labor07.labor7_1.labor7_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class JarmuPark {
    private ArrayList<Jarmu> jarmuvek = new ArrayList<>();

    public JarmuPark(String filename){
        try {
            Scanner file = new Scanner(new File(filename));
            while(file.hasNextLine()){
                String line = file.nextLine();
                // System.out.println(line );
                String[] array = line.split(",");
                String tipus = array[0].trim();
                String rendszam = array[1].trim();
                String marka = array[2].trim();
                if(tipus.equals("AUTO")){
                    int ferohely = Integer.parseInt(array[3].trim());
                    Jarmu j = new Auto(rendszam,marka,ferohely);
                    jarmuvek.add(j);
                }
                else {
                    String motortipus = array[3].trim();
                    Jarmu j = new Motorbicikli(rendszam, marka, motortipus);
                    jarmuvek.add(j);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void ujJarmu(Jarmu jarmu){
        jarmuvek.add(jarmu);
    }
    public void listaz(){
        for(Jarmu j : jarmuvek){
            System.out.println(j);
        }
    }
    public Jarmu kereses(String rendszam){
        for(Jarmu j : jarmuvek){
            if(j.getRendszam().equals(rendszam)) return j;
        }
        return null;
    }
    public Jarmu kolcsonzes(String rendszam){
        for(Jarmu j : jarmuvek){
            if(j.getRendszam().equals(rendszam)){
                j.setKolcsonzott(true);
                return j;
            }
        }
        return null;
    }
    public void visszavitel(String rendszam){
        for(Jarmu j : jarmuvek){
            if(j.getRendszam().equals(rendszam)){
                j.setKolcsonzott(false);
            }
        }
    }
    public int autokSzama(){
        int db = 0;
        for(Jarmu j : jarmuvek){
            if(j instanceof Auto){
                db++;
            }
        }
        return db;
    }
    public int motorokSzama(){
        int db = 0;
        for(Jarmu j : jarmuvek){
            if(j instanceof Motorbicikli){
                db++;
            }
        }
        return db;
    }
    public void autokKiirasaFajlba(String filename) {
        try {
            FileWriter writer = new FileWriter(filename);

            for (Jarmu j : jarmuvek) {
                if (j instanceof Auto) {
                    Auto a = (Auto) j;

                    writer.write(
                            a.getRendszam() + ", " +
                                    a.getMarka() + ", " +
                                    a.getUtasszam() + ", " +
                                    a.isKolcsonzott() + "\n"
                    );
                }
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void megNemKolcsonzottMotor(String filename){
        try {
            FileWriter writer = new FileWriter(filename);

            for (Jarmu j : jarmuvek) {
                if (j instanceof Motorbicikli) {
                    Motorbicikli a = (Motorbicikli) j;
                if(!(a.isKolcsonzott())){
                    writer.write(
                            a.getRendszam() + ", " +
                                    a.getMarka() + ", " +
                                    a.getTipus() + ", " +
                                    a.isKolcsonzott() + "\n"
                    );
                }
                }
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public boolean torol(String rendszam){
        for (int i = 0; i < jarmuvek.size(); i++) {
            if(jarmuvek.get(i).getRendszam().equals(rendszam)){
                jarmuvek.remove(i);
                return true;
            }
        }
        return false;
    }
}
