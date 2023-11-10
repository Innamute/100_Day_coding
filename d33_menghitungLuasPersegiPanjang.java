
package mutmainna;

import java.util.Scanner;

public class d33_menghitungLuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = scanner.nextDouble();

        double luas = panjang * lebar;
        System.out.println("Luas persegi panjang: " + luas);

        scanner.close();
    }
}

    

