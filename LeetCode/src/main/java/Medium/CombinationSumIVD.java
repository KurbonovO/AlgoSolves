package Medium;

public class CombinationSumIVD {

    public int combinationSum4(int[] nums, int target) {
        if (target == 0) {
            return 1;
        }
        int res = 0;
        for (int num : nums) {
            if (target >= num) {
                res += combinationSum4(nums, target - num);
            }
        }
        return res;
    }
}
