import java.util.List;
import java.util.Stack;

public class ValidParentheses {
  public boolean isValid(String s) {
    var stack = new Stack<Character>();
    var leftBrackets = List.of('(', '[', '{');
    var rightBrackets = List.of(')', ']', '}');

    for (char ch : s.toCharArray()) {
      if (leftBrackets.contains(ch))
        stack.push(ch);

      if (rightBrackets.contains(ch)) {
        if (stack.isEmpty())
          return false;

        var top = stack.pop();
        if (leftBrackets.indexOf(top) != rightBrackets.indexOf(ch))
          return false;
      }
    }
    return stack.isEmpty();
  }
}
