public class Main {
    public static void main(String[] args) {
        ChronometreThread thread1 = new ChronometreThread("thread1");
        ChronometreThread thread2 = new ChronometreThread("thread2");
        ChronometreThread thread3 = new ChronometreThread("thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}