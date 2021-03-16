public class MainClass {
    public static void main(String[] args) {

        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread = new Thread(t2);


        t1.start();
        thread.start();
    }
}
