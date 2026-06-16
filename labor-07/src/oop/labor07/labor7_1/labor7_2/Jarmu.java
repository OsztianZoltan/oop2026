package oop.labor07.labor7_1.labor7_2;

public class Jarmu {
    private String rendszam;
    private String marka;
    private boolean kolcsonzott ;

    public Jarmu(String rendszam, String marka) {
        this.rendszam = rendszam;
        this.marka = marka;
        kolcsonzott=false;
    }

    public String getRendszam() {
        return rendszam;
    }

    public String getMarka() {
        return marka;
    }

    public boolean isKolcsonzott() {
        return kolcsonzott;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setKolcsonzott(boolean kolcsonzott) {
        this.kolcsonzott = kolcsonzott;
    }

    @Override
    public String toString() {
        return "Jarmu{" +
                "rendszam='" + rendszam + '\'' +
                ", marka='" + marka + '\'' +
                ", kolcsonzott=" + kolcsonzott +
                '}';
    }
}
