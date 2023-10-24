
package mutmainna;

import java.util.Vector;

public class d16_vektor {
    public static void main(String[] args) {
        // Membuat objek Vector dengan tipe data String
        Vector<String> vector = new Vector<>();

        // Menambahkan elemen ke dalam Vector
        vector.add("Halo");
        vector.add("Ini");
        vector.add("adalah");
        vector.add("contoh");
        vector.add("vektor");

        // Menampilkan isi Vector
        for (String element : vector) {
            System.out.println(element);
        }
    }
}
    
    

