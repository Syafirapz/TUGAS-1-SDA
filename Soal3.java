import java.util.ArrayList;

public class Soal3 {
    //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini get(0), get(2), get(6), get(-3)
    public static void main(String[] args) {
    //String [] nama = {"A","H","R","A"};
    ArrayList<String> nama = new ArrayList<String>();
    nama.add("A");
    nama.add("H");
    nama.add("R");
    nama.add("A");

    System.out.println(nama.get(0));
    System.out.println(nama.get(2));
    System.out.println(nama.get(6));
    System.out.println(nama.get(-3));
    }    
}
