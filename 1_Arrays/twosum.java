public class twosum {
    // Find two numbers in a sorted array that add up to a specific target.

    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        twosum solution = new twosum();

        // Example 1
        int[] numbers1 = { 2, 7, 11, 15 };
        int target1 = 9;
        int[] result1 = solution.twoSum(numbers1, target1);
        System.out.println("Example 1 Result: [" + result1[0] + ", " + result1[1] + "]");

        // Example 2
        int[] numbers2 = { 2, 3, 4 };
        int target2 = 6;
        int[] result2 = solution.twoSum(numbers2, target2);
        System.out.println("Example 2 Result: [" + result2[0] + ", " + result2[1] + "]");

        // Example 3
        int[] numbers3 = { -1, 0 };
        int target3 = -1;
        int[] result3 = solution.twoSum(numbers3, target3);
        System.out.println("Example 3 Result: [" + result3[0] + ", " + result3[1] + "]");
    }

}
