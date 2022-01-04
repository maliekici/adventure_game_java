package adventure_game;
import java.util.Scanner;
public abstract class Lokasyon {
    Scanner scan = new Scanner(System.in);
    //burada tanımladığımız oyuncu Oyun classının altında olan kullanıcının seçmiş olduğu değerlerle gelir.
    protected Oyuncu oyuncu;
    protected String adi;
    
    
    Lokasyon(Oyuncu oyuncu){
        this.oyuncu = oyuncu;
    }
    
    public abstract boolean getLokasyon();

    public void setOyuncu(Oyuncu oyuncu) {
        this.oyuncu = oyuncu;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public Oyuncu getOyuncu() {
        return oyuncu;
    }

    public String getAdi() {
        return adi;
    }
    
}
