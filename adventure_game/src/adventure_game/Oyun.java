package adventure_game;

import java.util.Scanner;

public class Oyun {

    Oyuncu oyuncu;
    Lokasyon lokasyon;
    Scanner scan = new Scanner(System.in);

    public void giris() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Maceraya Hazır Mısın");
        System.out.println("Önce İsminizi Girin : ");
        String oyuncuAdi = scan.nextLine();
        oyuncu = new Oyuncu(oyuncuAdi);
        oyuncu.karakterSec();
        basla();
    }

    public void basla() {
        while (true) {
            System.out.println("");
            System.out.println("=========================================");
            System.out.println("");
            System.out.println("Bir Yer Seçiniz");
            System.out.println("1. Güvenli Ev --> Sizin Düşman Olmayan Güvenli Mekanınız ");
            System.out.println("2. Mağara --> Karşınıza Belki ZOMBİ Çıkabilir !");
            System.out.println("3. Orman --> Karşınıza Belki VAPMİR Çıkabilir !");
            System.out.println("4. Nehir --> Karşınıza Belki AYI Çıkabilir !");
            System.out.println("5. Mağaza --> Silah veya Zırh Alabilirsiniz");
            System.out.print("Gitmek İstediğini Lokasyon : ");
            int lokasyonSec = scan.nextInt();
            while (lokasyonSec < 0 || lokasyonSec > 5) {
                System.out.println("Lütfen Geçerli Bir Yer Seçiniz : ");
                lokasyonSec = scan.nextInt();
            }
            switch (lokasyonSec) {
                case 1:
                    lokasyon = new GuvenliEv(oyuncu);//16.satırdaki oyuncuyu içine atadık
                    break;
                case 2:
                    lokasyon = new Magara(oyuncu);
                    break;
                case 3:
                    lokasyon = new Orman(oyuncu);
                    break;
                case 4:
                    lokasyon = new Nehir(oyuncu);
                    break;
                case 5:
                    lokasyon = new Magaza(oyuncu);
                    break;
                default:
                    lokasyon = new GuvenliEv(oyuncu);
            }
            
            if (lokasyon.getClass().getName().equals("GuvenliEv")) {
                if (oyuncu.getEnv().isYananOdun() && oyuncu.getEnv().isYemek() && oyuncu.getEnv().isSu()) {
                    System.out.println("Tebrikler Oyunu Kazandınız");
                    break;  
                }
            }
            //lokasyon classınde tanımladığımız gibi get location bize true yada false döndürür. başıne ! koyduğumuz zaman eğer dönene değer false ise olur.
            if(!lokasyon.getLokasyon()){
                System.out.println("Oyun Bitti !");
                break;
            }
        }
    }
}
