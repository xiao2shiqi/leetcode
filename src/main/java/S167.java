import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * LC#167 Two Sum II - Input array is sorted
 * Link：https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class S167 {

    public static int[] twoSum(int[] numbers, int target) {
        //two hash,  time : O(n)
        Map<Integer, Integer> intHash = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            intHash.put(numbers[i], i);
        }
        for (int i = 0; i < numbers.length; i++) {
            int targetKey = target - numbers[i];
            if(intHash.containsKey(targetKey)) {
                int indexValue = intHash.get(targetKey);
                return new int[]{i + 1, indexValue + 1};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(numbers, target);
        System.out.println(Arrays.toString(result));
    }
}
