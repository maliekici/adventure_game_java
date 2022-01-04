package adventure_game;

public class GuvenliEv extends GuvenliLokasyonlar {

    public GuvenliEv(Oyuncu oyuncu) {
        super(oyuncu, "Güvenli Ev");
    }
    
    public boolean getLokasyon() {
        oyuncu.setSaglik(oyuncu.getGercekSaglik());
        System.out.println("Canının Karakterin Max Sağlık Seviyesine Çıktı...");
        System.out.println("Şu An Kendi Güvenli Evinizdesiniz.");
        return true;
    }
}
