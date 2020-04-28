package android.bignerdranch.com.androidlab1;

public class ThreadHandler {
    static ThreadHandler instance;
    private ThreadHandler(Thread thread) {
        thread.start();
    }

    public static ThreadHandler createInstance(Thread thread) {
        if(instance == null) {
            instance = new ThreadHandler(thread);
            return  instance;
        } else {
            return  instance;
        }
    }
}
