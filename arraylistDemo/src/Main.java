import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();
        System.out.println("Oluşturulduğu andaki eleman sayısı: " + sayilar.size());
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
        System.out.println("Ekleme yapıldıktan sonraki eleman sayısı: " + sayilar.size());
        System.out.println("Sayılar arraylistinin 2 no'lu (yani 3.) elemanı: " + sayilar.get(2));
        sayilar.set(2,"Adalar");
        System.out.println("Değişim sonrası 2 no'lu (yani 3.) eleman: " + sayilar.get(2));
        for (Object eleman:sayilar){
            System.out.println(eleman);
        }
    }
}