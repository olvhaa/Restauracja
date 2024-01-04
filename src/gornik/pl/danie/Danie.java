package gornik.pl.danie;

import java.util.List;

public abstract class Danie {
    private String nazwa;
    private double cena;
    private List<String> komponenty;

    public Danie(String nazwa, double cena, String komponenty) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.komponenty = List.of(komponenty.split(" "));
    }

    public abstract void prepare();

    public abstract void giveDish();

    public void changeComponents(String components){
        this.komponenty = List.of(components.split(" "));
    }


    @Override
    public String toString() {
        return "Danie{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", komponenty='" + komponenty + '\'' +
                '}';
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public String getKomponenty() {
        return komponenty.toString();
    }
}