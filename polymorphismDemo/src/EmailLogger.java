public class EmailLogger extends BaseLogger{
    //Aşağıdaki metodu yazmasak da inheritence olur ama biz base metodu overload ettik
    //BaseLogger'daki metodun üstüne yaqzdık çünkü ayrıca bir loglama ya da raporlamayı
    //tercih ettik.
    public void log(String message){
        System.out.println("Logged to email:" +message);
    }
}
