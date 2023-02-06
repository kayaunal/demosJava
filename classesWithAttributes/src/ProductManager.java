public class ProductManager {
    public void Add(Product product) {
        //JDBC ile veritabanına kaydedeceğiz
        System.out.println("Ürün eklendi " + product.getName());
    }
}
