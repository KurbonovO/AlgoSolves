package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }

    public static void main(String[] args) {

        TwoSum twoSum = new TwoSum();

        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));
    }
}
