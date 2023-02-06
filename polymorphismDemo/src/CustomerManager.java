public class CustomerManager {
    //private alan oluşturuyoruz yani field, yani attribute
    private BaseLogger logger;
    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }
    public void Add(){
        //veritabanına ekleme kodları yazdık varsayalım..
        System.out.println("Müşteri eklendi");
        this.logger.log("log mesajı");

    }
}
