package adventure_game;

public class Magaza extends GuvenliLokasyonlar {

    Magaza(Oyuncu oyuncu) {
        super(oyuncu, "Mağaza");
    }

    public boolean getLokasyon() {
        System.out.println("Para : " + oyuncu.getPara());
        System.out.println("1. Silahlar ");
        System.out.println("2. Zırhlar");
        System.out.println("3. Çıkış");
        System.out.println("Seçiminiz : ");
        int esyaSat = scan.nextInt();
        int esyaSatID;
        switch (esyaSat) {
            case 1:
                esyaSatID = silahMenusu();
                silahAl(esyaSatID);

                break;
            case 2:
                esyaSatID = armorMenu();
                armorAl(esyaSatID);
                break;
            default:
        }
        return true;
    }
    
    public int armorMenu(){
        System.out.println("1. Hafif <Para : 15 - Avoid : 1>");
        System.out.println("2. Orta <Para : 25 - Avoid : 3>");
        System.out.println("3. Ağır <Para : 40 - Avoid : 5>");
        System.out.println("4. Çıkış Yap");
        System.out.println("Silah Seçiniz : ");
        int armorSecID = scan.nextInt();
        return armorSecID;
    }
    
    public void armorAl(int itemID){
        int avoid = 0, fiyat = 0;
        String armorAdi = null;
        switch (itemID) {
            case 1:
                avoid = 1;
                armorAdi = "Hafif Zırh";
                fiyat = 15;
                break;
            case 2:
                avoid = 3;
                armorAdi = "Orta Zırh";
                fiyat = 15;
                break;
            case 3:
                avoid = 7;
                armorAdi = "Ağır Zırh";
                fiyat = 40;
                break;
            case 4:
                System.out.println("Çıkış Yapılıyor");
            default:
                System.out.println("Geçersiz işlem");
                break;
        }
        if (fiyat > 0) {
            if (oyuncu.getPara() >= fiyat) {
            oyuncu.getEnv().setArmor(avoid);
            oyuncu.getEnv().setArmorAdi(armorAdi);
            oyuncu.setPara(oyuncu.getPara() - fiyat);
            System.out.println(armorAdi + "Satın Adlınız, Engellenen Hasar : " + oyuncu.getEnv().getArmor());
            System.out.println("Kalan Para : " + oyuncu.getPara());
        } else {
            System.out.println("Para Yetersiz");
        }
        }
    }

    public int silahMenusu() {
        System.out.println("1. Tabanca <Para : 25 - Hasar : 2>");
        System.out.println("2. Kılıç <Para : 35 - Hasar : 3>");
        System.out.println("3. Tüfek <Para : 45 - Hasar : 7>");
        System.out.println("4. Çıkış Yap");
        System.out.println("Silah Seçiniz : ");
        int silahSecID = scan.nextInt();
        return silahSecID;
    }

    public void silahAl(int itemID) {
        int hasar = 0, fiyat = 0;
        String silahAdi = null;
        switch (itemID) {
            case 1:
                hasar = 2;
                silahAdi = "Tabanca";
                fiyat = 25;
                break;
            case 2:
                hasar = 3;
                silahAdi = "Kılıç";
                fiyat = 35;
                break;
            case 3:
                hasar = 7;
                silahAdi = "Tüfek";
                fiyat = 45;
                break;
            case 4:
                System.out.println("Çıkış Yapılıyor");
            default:
                System.out.println("Geçersiz işlem");
                break;
        }
        if (fiyat > 0) {
            if (oyuncu.getPara() > fiyat) {
            oyuncu.getEnv().setHasar(hasar);
            oyuncu.getEnv().setSilahAdi(silahAdi);
            oyuncu.setPara(oyuncu.getPara() - fiyat);
            System.out.println(silahAdi + "Aldınız , Önceki Hasar : " + oyuncu.getHasar() + "Yeni Hasar "
                    + oyuncu.getToplamHasar());
            System.out.println("Kalan Para : " + oyuncu.getPara());
        } else {
            System.out.println("Para Yetersiz");
        }
        }
    }
}
