public class Main {
    public static void main(String[] args) {
////        EmailLogger logger = new EmailLogger();
////        logger.Log("Log mesajı");
//        //Yukarıdaki gibi kullanabileceğimiz gibi array oluşturarak da kullanabiliriz:
//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger()};
//        //Döngü ile array içindeki tüm tipleri çağırırız.
//        for (BaseLogger logger:loggers){
//            logger.Log("Log mesajı");
//        }
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.Add();
    }
}