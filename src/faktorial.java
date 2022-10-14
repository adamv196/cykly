import java.util.Scanner;

public class faktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadaj cislo");
        int x = sc.nextInt();

        int fakt = 1;

        for (int i = 1; i <= x; i++) {
            fakt = fakt * i;
        }
        System.out.println("Faktorial cisla " + x + " je:" );
        System.out.println(x + "! = " + fakt);
        sc.close();
    }
}
