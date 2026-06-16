package oop.labor07.labor7_1.labor7_2;

import java.sql.SQLOutput;

public class Main {
    static void main() {
        Jarmu j1 = new Auto("MS14SPK","Toyota",5);
        Jarmu j2 = new Motorbicikli("MS96RZV","Kawasaki","sport");
        System.out.print("Elso peldany:\n");
        System.out.println(j1);
        System.out.print("\n");
        System.out.print("Masodik peldany:\n");
        System.out.println(j2);
        System.out.println("-------JARMUPARK-------");
        JarmuPark j = new JarmuPark("jarmuvek.txt");
        j.ujJarmu(j1);
        System.out.print("Jarmuvek kiiratasa: \n");
        j.listaz();
        System.out.println(j.kereses("MS14SPK"));
        System.out.println("Kolcsonzes: ");
        j.kolcsonzes("MS14SPK");
        System.out.println(j.kereses("MS14SPK"));
        j.visszavitel("MS14SPK");
        System.out.println(j.kereses("MS14SPK"));
        System.out.println("Autok szama: ");
        System.out.println(j.autokSzama());
        System.out.println("Motorok szama: ");
        System.out.println(j.motorokSzama());
        j.autokKiirasaFajlba("autok.txt");
        j.megNemKolcsonzottMotor("motorok.txt");
        System.out.println("MS 14 SPK auto torlese");
        System.out.println(j.torol("MS14SPK"));

    }
}
