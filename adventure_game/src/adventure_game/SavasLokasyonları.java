package adventure_game;

public abstract class SavasLokasyonları extends Lokasyon {

    protected Canavar canavar;
    protected String odul;

    SavasLokasyonları(Oyuncu oyuncu, String adi, Canavar canavar, String odul) {
        super(oyuncu);
        this.canavar = canavar;
        this.adi = adi;
        this.odul = odul;
    }

    public boolean getLokasyon() {
        int cnvrSayisi = canavar.canavarSayisi();
        System.out.println("Şuan buradasınız : " + this.getAdi());
        System.out.println("Dikkatli ol! Burada " + cnvrSayisi + " tane " + canavar.getAdi() + " yaşıyor.");
        System.out.println("<S>avaş veya <K>aç");
        String durumSec = scan.next();
        durumSec = durumSec.toUpperCase();
        
        if (durumSec.equals("S")) {
            if (savas(cnvrSayisi)) {
                System.out.println(this.getAdi() + "Bölgesindeki Tüm Düşmanları Temizlediniz");
                if (this.odul.equals("Yemek") && oyuncu.getEnv().isYemek() == false) {
                    System.out.println(this.odul + "kazandınız");
                    oyuncu.getEnv().setYemek(true);
                } else if (this.odul.equals("Su") && oyuncu.getEnv().isSu() == false) {
                    System.out.println(this.odul + "kazandınız");
                    oyuncu.getEnv().setSu(true);
                } else if (this.odul.equals("Yakacak Odun") && oyuncu.getEnv().isYananOdun() == false) {
                    System.out.println(this.odul + "kazandınız");
                    oyuncu.getEnv().setYananOdun(true);
                }
                return true;
            }
            if (oyuncu.getSaglik() <= 0) {
                System.out.println("Öldünüz !");
                return false;
            }
        }
        return true;
    }

    public boolean savas(int cnvrSayisi) {
        for (int i = 0; i < cnvrSayisi; i++) {
            int defaultCnvrCani = canavar.getSaglık();
            oyuncuDeger();
            dusmanDeger();
            while (oyuncu.getSaglik() > 0 && canavar.getSaglık() > 0) {
                System.out.println("<V>ur veya <K>aç");
                String durumSec = scan.next();
                durumSec = durumSec.toUpperCase();
                if (durumSec.equals("V")) {
                    System.out.println("Siz vurdunuz ! ");
                    canavar.setSaglık(canavar.getSaglık() - oyuncu.getToplamHasar());
                    vurustanSonra();
                    if (canavar.getSaglık() > 0) {
                        System.out.println();
                        System.out.println("Canavar Size Vurdur");
                        oyuncu.setSaglik(oyuncu.getSaglik() - (canavar.getHasar() - oyuncu.getEnv().getArmor()));;
                        vurustanSonra();
                    }
                } else {
                    return false;
                }
            }
            if (canavar.getSaglık() < oyuncu.getSaglik()) {
                System.out.println("Düşmanı Yendiniz");
                oyuncu.setPara(oyuncu.getPara() + canavar.getOdul());
                System.out.println("Güncel Paranız : " + oyuncu.getPara());
                canavar.setSaglık(defaultCnvrCani);
            } else {
                return false;
            }
            System.out.println("---------------------");
        }
        return true;
    }

    public void oyuncuDeger() {
        System.out.println("Oyuncu Değerleri \n----------");
        System.out.println("Can : " + oyuncu.getSaglik());
        System.out.println("Hasar : " + oyuncu.getToplamHasar());
        System.out.println("Para : " + oyuncu.getPara());
        if (oyuncu.getEnv().getHasar() > 0) {
            System.out.println("Silah : " + oyuncu.getEnv().getSilahAdi());
        }
        if (oyuncu.getEnv().getArmor() > 0) {
            System.out.println("Zırh : " + oyuncu.getEnv().getSilahAdi());
        }
    }

    public void dusmanDeger() {
        System.out.println("\n" + canavar.getAdi() + "Değerleri\n----------");
        System.out.println("Can : " + canavar.getSaglık());
        System.out.println("Hasar : " + canavar.getHasar());
        System.out.println("Ödül : " + canavar.getOdul());
    }

    public void vurustanSonra() {
        System.out.println("Oyuncu Canı : " + oyuncu.getSaglik());
        System.out.println(canavar.getAdi() + "canı : " + canavar.getSaglık());
        System.out.println("");
    }

}
