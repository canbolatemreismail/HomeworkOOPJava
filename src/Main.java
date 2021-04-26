import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Menu Seçimi yapınız");
        System.out.println("1. Seçilmiş Menü");
        System.out.println("2. Ramazan Menüsü");
        Menu menu1 = new Menu("1.Seçilmiş Menu", "Büyük Boy Pizza");
        Menu menu2 = new Menu("2. Ramazan Menüsü", "Ana Yemek - Çorba - Tatlı");
        Menu[] menus = {menu1,menu2};
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("1.Tiger Pizza (Orta) + Coca-Cola 33 cl");
                System.out.println("2.Kıymalı Pide + Coca-Cola 33 cl");
                System.out.println("3.Tavuk Kanat+ Közlenmiş domates, közlenmiş biber, salata, turşu");
                System.out.println("4.Izgara Tavuk+ Bulgur pilavı, sumaklı soğan, salata, acılı ezme, közlenmiş biber, közlenmiş domates ile");
                int input1 = scanner.nextInt();
                switch (input1) {
                    case 1:
                        menu1.Add();
                        break;
                    case 2:
                        menu1.Add();
                        break;
                    case 3:
                        menu1.Add();
                        break;
                    case 4:
                        menu1.Add();
                        break;
                    default:
                        System.out.println("Menüde olmayan bir seçim yaptınız!");
                }
                break;
            case 2:
                System.out.println("1. Tavuklu Pilav + Domates Çorba + Sütlaç");
                System.out.println("2. Tavuklu Nohutlu Pilav + Çiğ Köfte + Ayran 30 cl");
                System.out.println("3. Çiğ Köfte (1 kg.) + Garnitür + Seçeceğiniz Tatlı (1 kg.) + İçecek (1 L.)");
                System.out.println("4. Ezogelin Çorbası + Izgara Köfte + Ezme + Haydari + Hurma + Günün Tatlısı + İçecek 20 cl");
                System.out.println("5. Seçeceğiniz Çorba + Seçeceğiniz Ana Yemek + Seçeceğiniz Yardımcı Ürün + Yoğurt + Seçeceğiniz Tatlı");
                int input2 = scanner.nextInt();
                switch (input2) {
                    case 1:
                        menu2.Add();
                        break;
                    case 2:
                        menu2.Add();
                        break;
                    case 3:
                        menu2.Add();
                        break;
                    case 4:
                        menu2.Add();
                        break;
                    default:
                        System.out.println("Menüde olmayan bir seçim yaptınız!");
                }
                break;
            case 3:
                break;
            default:
                System.out.println("Her hangi bir seçim yapmadınız");
        }
    }
}
