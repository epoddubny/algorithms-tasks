class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = numbers.length - 1;

        while (numbers[left] + numbers[right] != target) {
            if (numbers[left] + numbers[right] > target) {
                right--;
                continue;
            }
            if (numbers[left] + numbers[right] < target) {
                left ++;
                continue;
            }
        }

        result[0] = left + 1;
        result[1] = right + 1;

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