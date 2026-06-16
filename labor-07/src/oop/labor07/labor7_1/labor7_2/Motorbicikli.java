package oop.labor07.labor7_1.labor7_2;

public class Motorbicikli extends Jarmu{
    private String tipus;

    public Motorbicikli(String rendszam, String marka, String tipus) {
        super(rendszam, marka);
        this.tipus = tipus;
    }

    public String getTipus() {
        return tipus;
    }

    @Override
    public String toString() {
        return "Motorbicikli{" + super.toString() + " " +
                "tipus='" + tipus + '\'' +
                '}';
    }
}
