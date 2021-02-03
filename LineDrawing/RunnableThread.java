package LineDrawing;

public class RunnableThread implements Runnable {
    private  LiningPanel panel;
    private static boolean stopped = false;

    public RunnableThread(LiningPanel panel1) {
        panel = panel1;
    }


    @Override
    public void run() {


        while (true) {
            if (!isStopped()) {
                panel.repaint();
                panel.counter();

            }
            try {
                Thread.sleep(300);
            } catch (Exception e) {
            }
        }

    }

    public void setPanel(LiningPanel panel) {
        this.panel = panel;
    }


    public static boolean isStopped() {
        return stopped;
    }


    public void setStopped(boolean stopped) {
        RunnableThread.stopped = stopped;
    }

}


