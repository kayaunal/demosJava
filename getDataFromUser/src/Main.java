import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir tamsayı girin: ");
//        int userInput = scanner.nextInt();
//        System.out.print("Girilen tamsayı: "+userInput);
        while (!scanner.hasNextInt()){
            System.out.println("Hatalı giriş yaptınız. Tamsayı girmeniz beklenmektedir.\nLütfen bir tamsayı girin: ");
            scanner.nextLine();
        }
        int userInput = scanner.nextInt();
        System.out.println("Giriş kabul edildi. Girdiğiniz tamsayı değeri: " + userInput);
    }
}