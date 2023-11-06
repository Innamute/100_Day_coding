
import java.util.Scanner;

public class mutmainna1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("memasukkan sebuah karakter:");
        char karakter = scanner.next().charAt(0);
        System.out.println("karakter yang dimasukkan:" + karakter);

        scanner.close();
    }
}
