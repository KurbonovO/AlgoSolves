package Easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

  public boolean containsDuplicate(int[] input) {

    Set<Integer> set = new HashSet<>();

    for (int i = 0; i < input.length; i++) {

      if (set.contains(input[i])) {
        return true;
      }
      set.add(input[i]);
    }
    return false;
  }

  public static void main(String[] args) {

    int[] input = {1, 2, 3, 3};

    ContainsDuplicate containsDuplicate = new ContainsDuplicate();
    System.out.println(containsDuplicate.containsDuplicate(input));
  }

}
