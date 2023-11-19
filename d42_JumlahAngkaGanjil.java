
import java.util.Scanner;

public class d42_JumlahAngkaGanjil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai : ");
        int angka = sc.nextInt();
        int m = 0;
        for (int i = 1; i <= angka; i++) {
            if (i % 2 == 1) {
                m++;
            }
            System.out.println(i);

        }
        System.out.println("jadi jumlah angka genjil adalah " + m);
    }

}
