public class Main {
    public static void main(String[] args) {
        BaseCreditManager[] creditManagers = new BaseCreditManager[]
                {new AgroCreditManager(), new TeacherCreditManager(), new StudentCreditManager()};

        for (BaseCreditManager creditManager:creditManagers){
            System.out.println(creditManager.hesapla(1000));
        }
    }
}