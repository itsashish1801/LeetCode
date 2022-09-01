public class DailyTemperatures {
  public int[] dailyTemperatures(int[] temperatures) {
    int[] answer = new int[temperatures.length];

    for (int i = 0; i < temperatures.length; i++) {
      int count = 1;
      int j = i + 1;

      while (j < temperatures.length) {
        if (temperatures[j] > temperatures[i]) {
          answer[i] = count;
          break;
        }
        count++;
        j++;
      }
    }
    return answer;
  }
}
