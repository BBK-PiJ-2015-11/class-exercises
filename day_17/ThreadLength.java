import java.util.List;

public class ThreadLength implements Runnable {
  private int duration;
  private int threadId;
  private CompletedTaskCollector collector;

  public ThreadLength(int duration, int threadId, CompletedTaskCollector collector) {
    this.duration = duration;
    this.threadId = threadId;
    this.collector = collector;
  }

  @Override
  public void run() {
    try {
      Thread.sleep(this.duration);
    } catch(InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
    collector.addCompletedTask(this.threadId);
  }

  public static void main(String[] args) {
    CompletedTaskCollector collector = new CompletedTaskCollector();

    for (int i = 0; i < 10; i++) {
      System.out.print("Enter the duration (in ms) of task " + i + ": ");
      int duration = Integer.parseInt(System.console().readLine());

      Runnable r = new ThreadLength(duration, i, collector);
      Thread newThread = new Thread(r);
      newThread.start();

      List<Integer> completedTaskIds = collector.getCompletedTasks();
      if (completedTaskIds.size() > 0) {
        System.out.print("Finished tasks: " + completedTaskIds);
      }
    }
  }

}
