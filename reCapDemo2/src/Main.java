public class Main {
    public static void main(String[] args) {
        //double [] myList = new double[4];
        //Yukarıdaki gibi yazma ile aşağıdaki gibi yazma arasında fark yok.
        //Süslü parantez açıp içine listedeki değerleri yazmak ile "new"lemek aynı şey.
        double[] myList = {1.2, 1.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);

        }
        System.out.println("Toplam= " + total);
        System.out.println("En büyük sayı= " + max);
    }
}