import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       int month, day;

       Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz Ay (Sayı cinsinden) :"); //kulanıcıdan doğduğu ay sayı cinsinden alınır
        month = input.nextInt();

        System.out.print("Doğduğunuz Gün :"); //kullanıcıdan doğduğu gün sayı cinsinden alınır
        day = input.nextInt();
        /*Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart
soru üzerinde verilen tabloya göre if-else statementı seçilir
örneğin 2. ayın 20'sine kadar balık burcu olduğunu görüyoruz
buna göre statement kullanıcıdan alınan month değeri 2 ise if(day<20)
bize kova burcunu yazdıracaktır
not:burçlar ve aylar string cinsinden de tanımlanarak ekrana yazdırma işlemi yapılabilir */
        if(month == 1) {
            if(day<22) {
                System.out.print("Burcunuz : Oğlak.");
            } else {
                System.out.print("Burcunuz : Kova");
            }
        } else if (month == 2) {
            if (day < 20) {
                System.out.println("Burcunuz : Kova");
            } else {
                System.out.println("Burcunuz : Balık");
            }
        } else if(month == 3) {
            if (day < 21) {
                System.out.println(" Burcunuz : Balık");
            } else {
                System.out.println("Burcunuz : Koç");
            }
        } else if(month == 4) {
            if (day < 21) {
                System.out.println(" Burcunuz : Koç");
            } else {
                System.out.println("Burcunuz : Boğa");
            }
        } else if(month == 5) {
            if (day < 22) {
                System.out.println(" Burcunuz : Boğa");
            } else {
                System.out.println("Burcunuz : İkizler");
            }
        } else if(month == 6) {
            if (day < 23) {
                System.out.println(" Burcunuz : İkizler");
            } else {
                System.out.println("Burcunuz : Yengeç");
            }
        } else if(month == 7) {
            if (day < 23) {
                System.out.println(" Burcunuz : Yengeç");
            } else {
                System.out.println("Burcunuz : Aslan");
            }
        }  else if(month == 8) {
            if (day < 23) {
                System.out.println(" Burcunuz : Aslan");
            } else {
                System.out.println("Burcunuz : Başak");
            }
        } else if(month == 9) {
            if (day < 23) {
                System.out.println(" Burcunuz : Başak");
            } else {
                System.out.println("Burcunuz : Terazi");
            }
        }  else if(month == 10) {
            if (day < 23) {
                System.out.println(" Burcunuz : Terazi");
            } else {
                System.out.println("Burcunuz : Akrep");
            }
        }  else if(month == 11) {
            if (day < 22) {
                System.out.println(" Burcunuz : Akrep");
            } else {
                System.out.println("Burcunuz : Yay");
            }
        }  else if(month == 12) {
            if (day < 22) {
                System.out.println(" Burcunuz : Yay");
            } else {
                System.out.println("Burcunuz : Oğlak");
            }
        }
    }
}