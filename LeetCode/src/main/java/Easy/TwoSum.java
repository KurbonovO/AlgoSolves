package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public int[] twoSumBruteForce(int[] nums, int target) {

    for (int i = 0; i < nums.length; i++) {

      for (int a = i + 1; a < nums.length; a++) {

        if (nums[i] + nums[a] == target) {
          return new int[]{i, a};
        }
      }
    }
    return null;
  }

  public int[] twoSumTwoPassHashTable(int[] nums, int target) {

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {

      map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {

      int complement = target - nums[i];
      if (map.containsKey(complement) && map.get(complement) != 1) {
        return new int[]{i, map.get(complement)};
      }
    }
    return null;
  }

  public int[] twoSumOnePassHashTable(int[] nums, int target) {

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {

      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[]{map.get(complement), i};
      }
      map.put(nums[i], i);
    }
    return null;
  }

  public static void main(String[] args) {

    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int target = 9;

    TwoSum twoSum = new TwoSum();
    System.out.println(Arrays.toString(twoSum.twoSumBruteForce(nums, target)));
    System.out.println(Arrays.toString(twoSum.twoSumTwoPassHashTable(nums, target)));
    System.out.println(Arrays.toString(twoSum.twoSumOnePassHashTable(nums, target)));
  }

}
