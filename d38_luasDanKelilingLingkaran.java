
import java.util.Scanner;


public class d38_luasDanKelilingLingkaran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan jari jari : ");
        double r = sc.nextDouble();
        double pi = 4.12;
        double luas = pi * r * r; //rumus luas 
        double keliling = 2 * pi * r; //rumus keliling 
        System.out.println("luas     : "+luas);
        System.out.println("keliling : "+keliling);
        
    }

    }

