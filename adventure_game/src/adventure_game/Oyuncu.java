package adventure_game;

import java.util.Scanner;

public class Oyuncu {

    private int hasar, saglik, para, gercekSaglik;
    private String adi, kAdi;
    private Envanter env;
    Scanner scan = new Scanner(System.in);

    public Oyuncu(String adi) {
        this.adi = adi;
        this.env = new Envanter();
    }

    public void karakterSec() {
        //fazla kod yazmamk için initOyuncu adındaki fonksiyon ile tanımlama yaptık
        switch (karakterMenu()) {
            case 1:
                initOyuncu("Kılıç Ustası", 5, 21, 15);
                break;
            case 2:
                initOyuncu("Büyücü", 7, 18, 20);
                break;
            case 3:
                initOyuncu("Savaşçı", 8, 24, 5);
                break;
            default:
                initOyuncu("Kılıç Ustası", 5, 21, 15);
                break;
        }
        System.out.println("Karakter: " + getAdi() + " ,Hasar: " + getHasar() + " ,Sağlık: " + getSaglik() + " ,Para" + getPara());
    }

    public int karakterMenu() {
        System.out.println("Karakter Seçiniz : ");
        System.out.println("1- Kılıç Ustası \t Hasar : 5 \t Sağlık 21 \t Para 15");
        System.out.println("2- Büyücü \t       Hasar : 7 \t Sağlık 18 \t Para 20");
        System.out.println("3- Savaşcı \t      Hasar : 8 \t Sağlık 24 \t Para 5");
        System.out.println("Karakter Seçiminiz : ");
        int karakterID = scan.nextInt();
        while (karakterID < 1 || karakterID > 3) {
            System.out.println("Lütfen Geçerli Bir Karakter Seçiniz :");
            karakterID = scan.nextInt();
        }
        return karakterID;
    }
    
    public int getToplamHasar(){
        return this.getHasar() + this.getEnv().getHasar();
    }

    public void initOyuncu(String kAdii, int hsar, int sglik, int pra) {
        setAdi(kAdii);
        setHasar(hsar);
        setSaglik(sglik);
        setPara(pra);
        //bu değer oyuncunun seçmiş olduğu karakteri hep sabit olarak tutan ve güvenli eve geldiğimizde yenilemeizi sağlayan değerdir.
        setGercekSaglik(sglik);
    }

    public int getHasar() {
        return hasar;
    }

    public int getSaglik() {
        return saglik;
    }

    public int getPara() {
        return para;
    }

    public String getAdi() {
        return adi;
    }

    public String getkAdi() {
        return kAdi;
    }

    public Envanter getEnv() {
        return env;
    }

    public void setHasar(int hasar) {
        this.hasar = hasar;
    }

    public void setSaglik(int saglik) {
        this.saglik = saglik;
    }

    public void setPara(int para) {
        this.para = para;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public void setkAdi(String kAdi) {
        this.kAdi = kAdi;
    }

    public void setEnv(Envanter env) {
        this.env = env;
    }

    public int getGercekSaglik() {
        return gercekSaglik;
    }

    public void setGercekSaglik(int gercekSaglik) {
        this.gercekSaglik = gercekSaglik;
    }
    

}
