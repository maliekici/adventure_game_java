package adventure_game;

import java.util.Random;

public class Canavar {
    private String adi;
    private int hasar,odul,saglık,maxSayı;

    public Canavar(String adi, int hasar, int saglık, int odul, int maxSayı) {
        this.adi = adi;
        this.hasar = hasar;
        this.odul = odul;
        this.saglık = saglık;
        this.maxSayı = maxSayı;
    }
    
    public int canavarSayisi(){
        Random r = new Random();
        return r.nextInt(this.maxSayı) + 1;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getHasar() {
        return hasar;
    }

    public void setHasar(int hasar) {
        this.hasar = hasar;
    }

    public int getOdul() {
        return odul;
    }

    public void setOdul(int odul) {
        this.odul = odul;
    }

    public int getSaglık() {
        return saglık;
    }

    public void setSaglık(int saglık) {
        this.saglık = saglık;
    }

    public int getMaxSayı() {
        return maxSayı;
    }

    public void setMaxSayı(int maxSayı) {
        this.maxSayı = maxSayı;
    }
    
    
    
}
