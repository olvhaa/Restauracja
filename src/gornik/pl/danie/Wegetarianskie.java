package gornik.pl.danie;

import gornik.pl.danie.Danie;

public class Wegetarianskie extends Danie {
    private String meatType;

    public Wegetarianskie(String nazwa, double cena, String komponenty, String meatType) {
        super(nazwa, cena, komponenty);
        this.meatType = meatType;
    }

    @Override
    public void prepare() {

    }

    @Override
    public void giveDish() {

    }

    @Override
    public String toString() {
        return "DaniaVegetarianskie{" +
                "nazwa='" + getNazwa() + '\'' +
                ", cena=" + getCena() +
                ", komponenty='" + getKomponenty() + '\'' +
                "meatType='" + meatType + '\'' +
                '}';
    }
}