
import java.util.Scanner;

public class mutmainna {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan berat (kg): ");
        double berat = scanner.nextDouble();
        System.out.print("Masukkan tinggi (m): ");
        double tinggi = scanner.nextDouble();

        double d = berat / (tinggi * tinggi);

        System.out.println(" jadi tinggi dan berat badan saya adalah: " + d);

    }

}
