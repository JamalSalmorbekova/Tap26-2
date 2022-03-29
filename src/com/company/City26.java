package com.company;
import java.util.Objects;

public class City26 implements Comparable<City26>{
    private   int kodu;
    private  String aty;
    private String mamleket;
    private  int kalky;

    public City26(int kodu, String aty, String mamleket, int kalky) {
        this.kodu = kodu;
        this.aty = aty;
        this.mamleket = mamleket;
        this.kalky = kalky;
    }

    public int getKodu() {
        return kodu;
    }

    public void setKodu(int kodu) {
        this.kodu = kodu;
    }

    public String getAty() {
        return aty;
    }

    public void setAty(String aty) {
        this.aty = aty;
    }

    public String getMamleket() {
        return mamleket;
    }

    public void setMamleket(String mamleket) {
        this.mamleket = mamleket;
    }

    public int getKalky() {
        return kalky;
    }

    public void setKalky(int kalky) {
        this.kalky = kalky;
    }

    @Override
    public String toString() {
        return "City26{" +
                "kodu=" + kodu +
                ", aty='" + aty + '\'' +
                ", mamleket='" + mamleket + '\'' +
                ", kalky=" + kalky +
                '}';
    }
    @Override
    public  int compareTo(City26 o) {
     return Integer.compare(o.getKodu(),this.kodu);
    }
}
