package Medium;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Geico Sr Software Engineer 5/22/23
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

  public int slidingWindow(String input) {

    Map<Character, Integer> chars = new HashMap();

    int left = 0;
    int right = 0;

    int res = 0;
    while (right < input.length()) {
      char r = input.charAt(right);
      chars.put(r, chars.getOrDefault(r,0) + 1);

      while (chars.get(r) > 1) {
        char l = input.charAt(left);
        chars.put(l, chars.get(l) - 1);
        left++;
      }

      res = Math.max(res, right - left + 1);

      right++;
    }
    return res;
  }

  public int slidingWindowOptimized(String input) {

    int result = 0;
    Map<Character, Integer> map = new HashMap<>(); // current index of character
    // try to extend the range [i, j]
    for (int j = 0, i = 0; j < input.length(); j++) {
      if (map.containsKey(input.charAt(j))) {
        i = Math.max(map.get(input.charAt(j)), i);
      }
      result = Math.max(result, j - i + 1);
      map.put(input.charAt(j), j + 1);
    }
    return result;
  }

}



