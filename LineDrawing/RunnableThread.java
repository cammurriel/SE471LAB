package LineDrawing;

public class RunnableThread implements Runnable{
    private LiningPanel panel;
    private boolean stopped = false;


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    }

