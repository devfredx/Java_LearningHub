public class PauseUtil {
    public static void pause(double seconds) {
        try {
            long milliseconds = (long) (seconds * 1000);
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
