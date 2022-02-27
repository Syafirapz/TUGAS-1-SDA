import java.util.ArrayList;

public class Soal6 {
    public static void main(String[] args) {
        //String[] nama = {"A","H","R","A"};
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("A");
        nama.add("H");
        nama.add("R");
        nama.add("A");
    
        nama.add(0,"e");
        System.out.println("Elemen setelah ditambahkan string e " + nama);
    
        nama.add(2,"f");
        System.out.println("Elemen setelah ditambahkan string f " + nama);
    
        nama.add(3,"g");
        System.out.println("Elemen setelah ditambahkan string g " + nama);
    
        nama.add(4,"h");
        System.out.println("Elemen setelah ditambahkan string h " + nama);
    
        nama.add(6,"h");
        System.out.println("Elemen setelah ditambahkan string h " + nama);
    
        nama.add(-3,"j");
        System.out.println("Elemen setelah ditambahkan string j " + nama);
        }
    
        
    }
    

