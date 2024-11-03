public class EvenThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even number: " + i);
                }
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
