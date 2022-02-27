import java.util.ArrayList;

public class soal4 {
    //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini: indexOf(a), indexOf(c), indexOf(q)
    public static void main(String[] args) {
    //String[] nama = {"A","H","R","A"};
    ArrayList<String> nama = new ArrayList<String>();
    nama.add("A");
    nama.add("H");
    nama.add("R");
    nama.add("A");

    System.out.println(nama.indexOf("a"));
    System.out.println(nama.indexOf("c"));
    System.out.println(nama.indexOf("q"));
    }
    
}
