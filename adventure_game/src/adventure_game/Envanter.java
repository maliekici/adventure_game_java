package adventure_game;
public class Envanter {
    private boolean su, yemek, yananOdun;
    private String silahAdi, armorAdi;
    private int hasar, armor;

    Envanter() {
        this.su = su;
        this.yemek = yemek;
        this.yananOdun = yananOdun;
        this.hasar = 0;
        this.armor = 0;
        this.silahAdi = null;
        this.armorAdi = null;
    }

    public boolean isSu() {
        return su;
    }

    public void setSu(boolean su) {
        this.su = su;
    }

    public boolean isYemek() {
        return yemek;
    }

    public void setYemek(boolean yemek) {
        this.yemek = yemek;
    }

    public boolean isYananOdun() {
        return yananOdun;
    }

    public void setYananOdun(boolean yananOdun) {
        this.yananOdun = yananOdun;
    }

    public String getSilahAdi() {
        return silahAdi;
    }

    public void setSilahAdi(String silahAdi) {
        this.silahAdi = silahAdi;
    }

    public String getArmorAdi() {
        return armorAdi;
    }

    public void setArmorAdi(String armorAdi) {
        this.armorAdi = armorAdi;
    }

    public int getHasar() {
        return hasar;
    }

    public void setHasar(int hasar) {
        this.hasar = hasar;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
    
}
