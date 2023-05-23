package Medium;


import java.util.HashSet;
import java.util.Set;

// Geico Sr Software Engineer
public class LongestSubstringWithoutRepeatingCharacters {

  public int BruteForce(String input) {

    int result = 0;
    for (int i = 0; i < input.length(); i++) {
      for (int j = i; j < input.length(); j++) {
        if (checkRepetition(input, i, j)) {
          result = Math.max(result, j - i + 1);
        }
      }
    }
    return result;
  }

  private boolean checkRepetition(String s, int start, int end) {

    Set<Character> chars = new HashSet<>();

    for (int i = start; i <= end; i++) {
      char c = s.charAt(i);
      if (chars.contains(c)) {
        return false;
      }
      chars.add(c);
    }
    return true;
  }

}



