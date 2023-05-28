package Medium;

public class HouseRobber {

  public int iterative(int[] nums) {

    int[] memo = new int[nums.length + 1];
    memo[0] = 0;
    memo[1] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      int value = nums[i];
      memo[i + 1] = Math.max(memo[i], memo[i - 1] + value);
    }
    return memo[nums.length];
  }

}
