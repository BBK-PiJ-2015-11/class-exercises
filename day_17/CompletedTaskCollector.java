import java.util.ArrayList;
import java.util.List;

public class CompletedTaskCollector {
  private List<Integer> collectedTaskIds = null;

  public CompletedTaskCollector() {
    this.collectedTaskIds = new ArrayList<Integer>();
  }

  public synchronized void addCompletedTask(int taskId) {
    collectedTaskIds.add(taskId);
  }

  public List<Integer> getCompletedTasks() {
    if (this.collectedTaskIds.size() == 0) {
      return new ArrayList<Integer>();
    }

    List<Integer> result = this.collectedTaskIds;
    collectedTaskIds = new ArrayList<Integer>();

    return result;
  }
}
