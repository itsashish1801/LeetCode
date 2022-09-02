import java.util.ArrayDeque;
import java.util.Queue;

public class ImplementStackUsingQueues {
  private Queue<Integer> queue1 = new ArrayDeque<>();
  private Queue<Integer> queue2 = new ArrayDeque<>();
  private int top;

  public void push(int x) {
    top = x;
    queue1.add(x);
  }

  public int pop() {
    while (queue1.size() > 1) {
      top = queue1.remove();
      queue2.add(top);
    }

    var temp = queue2;
    queue2 = queue1;
    queue1 = temp;

    return queue2.remove();
  }

  public int top() {
    return top;
  }

  public boolean empty() {
    return queue1.isEmpty();
  }
}
