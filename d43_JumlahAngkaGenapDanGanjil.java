
import java.util.Scanner;

public class d43_JumlahAngkaGenapDanGanjil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai : ");
        int angka = sc.nextInt();
        int e = 0;
        int m = 0;
        for (int i = 1; i <= angka; i++) {
            if (i % 2 == 0) {
                e++;
            } else {
                m++;
            }
            System.out.println(i);
        }
        System.out.println("jumlah nilai ganjil adalah " + e);

        System.out.println("jadi jumlah angka genap adalah " + m);
    }

}
