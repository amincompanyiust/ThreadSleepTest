public class T2 implements Runnable{
    @Override
    public void run() {
        for (int i = 100; i <= 200; i+=10) {
            System.err.println(i);
        }
    }
}
