package Medium;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] numbers) {

        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length - 2; i++) {

            int j = i + 1;
            int k = numbers.length - 1;

            while (j < k) {

                int sum = numbers[i] + numbers[j] + numbers[k];

                if (sum == 0) {
                    result.add(Arrays.asList(numbers[i], numbers[j++], numbers[k--]));
                } else if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
