import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String > sozluk = new HashMap<String, String>();
        sozluk.put("book", "kitap");
        sozluk.put("table", "masa");
        sozluk.put("computer", "bilgisayar");
        sozluk.put("chair", "sandalye");

        System.out.println(sozluk.get("table"));

        sozluk.remove("chair");
        System.out.println(sozluk.get("chair"));

        System.out.println("---------------");

        for (String item:sozluk.keySet()){
            System.out.println(item);
        }
    }
}