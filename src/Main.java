import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner class i projeye dahil edildi.
        Scanner input = new Scanner(System.in);

        // Kullanicinin girdigi veriyi saklamak icin degisken tanimlandi.
        int number;

        // Kullanicidan veri alinip onceden tanimladigimiz degiskene atadik.
        System.out.print("\nBir sayi gir: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) { // Bu for dongusu ile satir sayisini kullanicinin girdigi deger ile esledik.
            for (int j = 1; j <= number - i; j++) { // Bu dongude bosluk karakterini kodlayip yazdirdik.
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) { // Bu donguyu * karakterini girmek icin kodladik.
                System.out.print("*");
            }
            System.out.println();
        }

        // Asagida ki dongulerde ise yukarida ki islemin tam tersini hesapladik. Satir sayisini kullanicinin girdigi degerden 1 ufak belirttik.
        for (int i = number - 1; i >= 1; i--) {
            for (int j = number; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}