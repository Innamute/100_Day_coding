
package mutmainna;

import java.util.HashMap;
public class d19 {
    public static void main(String[] args) {
        // Membuat objek HashMap dengan Key berjenis String dan Value berjenis Integer
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Menambahkan elemen ke HashMap
        hashMap.put("Kunci1", 100);
        hashMap.put("Kunci2", 200);
        hashMap.put("Kunci3", 300);

        // Mengakses nilai dengan menggunakan kunci
        int nilai = hashMap.get("Kunci2");
        System.out.println("Nilai untuk Kunci2: " + nilai);
    }
}   