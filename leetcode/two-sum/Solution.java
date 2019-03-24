import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> numberToPosition = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            numberToPosition.put(numbers[i], i);
        }

        int requiredValue;
        Integer secondElement;
        for (int i = 0; i < numbers.length; i++) {
            requiredValue = target - numbers[i];
            secondElement = numberToPosition.get(requiredValue);
            if (secondElement != null && secondElement != i) {
                result[0] = i;
                result[1] = secondElement;
                return result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int targer = 9;

        int[] result = new Solution().twoSum(numbers, targer);

        for (int i = 0; i < result.length; i ++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}