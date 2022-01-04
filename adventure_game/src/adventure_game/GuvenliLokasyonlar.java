package adventure_game;
public abstract class GuvenliLokasyonlar extends Lokasyon {
    
    public GuvenliLokasyonlar(Oyuncu oyuncu, String adi) {
        super(oyuncu);
        this.adi = adi;
    }
    
    public abstract boolean getLokasyon();
 
    
}
