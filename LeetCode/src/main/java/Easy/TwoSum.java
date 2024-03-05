package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public int[] twoSumBrute(int[] nums, int target) {

    for (int i = 0; i < nums.length; i++) {

      if (nums[i] + nums[i + 1] == target) {

        return new int[] {i, i + 1};
      }
    }
    return null;
  }

  public int[] twoSumOnePassHashTable(int[] nums, int target) {

    Map<Integer, Integer> numMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (numMap.containsKey(complement)) {
        return new int[] {numMap.get(complement), i};
      }
      numMap.put(nums[i], i);
    }
    return new int[] {};
  }

  public static void main(String[] args) {

    TwoSum twoSum = new TwoSum();

    int[] nums = {2, 7, 11, 15};
    int target = 9;

    System.out.println(Arrays.toString(twoSum.twoSumBrute(nums, target)));
    System.out.println(Arrays.toString(twoSum.twoSumOnePassHashTable(nums, target)));
  }
}
