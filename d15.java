
package mutmainna;
import java.util.ArrayList;

public class d15 {


    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("merah");
        colors.add("hitam");
        colors.add("putih");
        colors.add("biru");
//        menghapius elemen dari ArrayList berdasarkan indeks
        int indexToRemove = 2;
        if (indexToRemove >= 0 && indexToRemove < colors.size()) {
            colors.remove(indexToRemove);
            System.out.println("elemen dengan indeks:" + indexToRemove);
        } else {
            System.out.println("indeks yang diminta tidak valid.");
        }
//        mencetak ArraList setelah di hapus
        System.out.println("isi arrayList setelah dihapus:");
        for (String color : colors) {
            System.out.println(colors);
        }
    }
}
    
