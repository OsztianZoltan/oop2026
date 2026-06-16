package oop.labor07.labor7_1.labor7_2;

public class Auto extends Jarmu{
    private int utasszam;
    public Auto(String rendszam, String marka, int utasszam) {
        super(rendszam, marka);
        this.utasszam=utasszam;
    }

    public int getUtasszam() {
        return utasszam;
    }

    @Override
    public String toString() {
        return "Auto{" +super.toString() + " " +
                "utasszam=" + utasszam +
                '}';
    }
}
