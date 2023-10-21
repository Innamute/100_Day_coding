package day13;
import java.util.ArrayList;

public class Day13 {
    public static void main(String[] args) {
        //membuat ArrayList
        ArrayList<String> daftarNama = new ArrayList<>();
        //Menambahkan elemen ke dalam ArrayList
        daftarNama.add("mute");
        daftarNama.add("inna");
        daftarNama.add("imut");
        //menampilkan ArrayList setelah ditambahkan elemen
        System.out.println("ArrayList setelah ditambahkan elemen: ");
        
        for (String nama : daftarNama){
            System.out.println(nama);
        }
        
    }
}
