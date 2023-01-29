public class Main {
    public static void main(String[] args) {
        // 6 mükemmel bir sayıdır --> 1,2,3 rakamlarına bölünür ve
        // bu rakamları topladığımızda 6 eder.
        // Bu şekildeki sayılara mükemmel denir.
        int number = 5;
        int total = 0;

        for (int i=1; i<number; i++){
            if (number % i ==0){
                total = total + i;
            }
        }

        if(total == number){
            System.out.println("Mükemmel sayıdır");
        }else{
            System.out.println("Mükemmel sayı değildir");
        }
    }
}
