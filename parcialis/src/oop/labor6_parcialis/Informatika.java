package oop.labor6_parcialis;

import java.util.ArrayList;

public class Informatika {
    private ArrayList<Diak> felvetelizok;

    public Informatika(){
        felvetelizok = new ArrayList<>();
    }
    public void ujBeiratkozo(Diak diak){
        felvetelizok.add(diak);
    }
    public int felvetelizokSzama(){
        return felvetelizok.size();
    }
    public double felvetelizokAtlaga(){
        if(felvetelizok.isEmpty())
            return 0;
        double osszeg = 0;
        for (Diak s : felvetelizok) {
            osszeg+=s.atlag();
        }
        return osszeg/felvetelizok.size();
    }
    public void listazOsszes(){
        for (Diak d : felvetelizok) {
            System.out.println(d);
        }
    }
    public void listazAtlag(double hatar){
        for (Diak d : felvetelizok) {
            if(d.atlag()>hatar){
                System.out.println(d);
            }
        }
    }
}
