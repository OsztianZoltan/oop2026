package oop.labor6_parcialis;

public class Diak {
    private String vnev;
    private String knev;
    private double erettsegi;
    private double matematika;

    public Diak(String vnev, String knev, double erettsegi, double matematika) {
        this.vnev = vnev;
        this.knev = knev;
        this.erettsegi = erettsegi;
        this.matematika = matematika;
    }

    public String getVnev() {
        return vnev;
    }

    public String getKnev() {
        return knev;
    }

    public double getErettsegi() {
        return erettsegi;
    }

    public double getMatematika() {
        return matematika;
    }

    public void setVnev(String vnev) {
        this.vnev = vnev;
    }

    public void setKnev(String knev) {
        this.knev = knev;
    }


    public void setErettsegi(double erettsegi) {
        this.erettsegi = erettsegi;
    }

    public void setMatematika(double matematika) {
        this.matematika = matematika;
    }
    public double atlag(){
        return (matematika+erettsegi)/2;
    }
    public Diak(){}

    @Override
    public String toString() {
        return "Diak{" +
                "vnev='" + vnev + '\'' +
                ", knev='" + knev + '\'' +
                ", erettsegi=" + erettsegi +
                ", matematika=" + matematika +
                ", atlag=" + atlag() +
                '}';
    }
}
