import java.util.Stack;

public class PalindromeNumber {
  public boolean isPalindrome(int x) {
    Stack<Character> stack = new Stack<>();
    String inputInString = String.valueOf(x);
    StringBuilder reversed = new StringBuilder();

    for (char ch : inputInString.toCharArray())
      stack.push(ch);

    while (!stack.isEmpty())
      reversed.append(stack.pop());

    return inputInString.equals(reversed.toString());
  }
}
