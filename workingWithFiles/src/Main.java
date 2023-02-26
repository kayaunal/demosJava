import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        getFileInfo();
    }
    public static void createFile(){
        File file = new File("C:\\demosJava\\files\\students.txt");
        try {
            if (file.createNewFile()){
                System.out.println("Dosya oluşturuldu");
            }else{
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void getFileInfo(){
        File file = new File("C:\\demosJava\\files\\students.txt");
        if(file.exists()){
            System.out.println("Dosya adı: "+ file.getName());
            System.out.println("Dosya yolu: "+ file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi: "+ file.canWrite());
            System.out.println("Dosya okunabilir mi: "+ file.canRead());
            System.out.println("Dosya boyutu (byte): "+ file.length());
        }
    }
}