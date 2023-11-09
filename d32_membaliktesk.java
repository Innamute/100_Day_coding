
package mutmainna;

import java.util.Scanner;

public class d32_membaliktesk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata : ");
        String teks = scanner.nextLine();
        String teksTerbalik = "";

        for (int i = teks.length() - 1; i >= 0; i--) {
            teksTerbalik += teks.charAt(i);
        }

        System.out.println("Teks terbalik: " + teksTerbalik);

        scanner.close();
    }
}

    

    

