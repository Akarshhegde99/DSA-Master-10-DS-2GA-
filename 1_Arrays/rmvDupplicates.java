//In-place removal of duplicates in a sorted array, modifying the array with two pointers.

class rmvDupplicates {
  public static int removeDuplicates(int[] nums) {
    if (nums.length == 0)
      return 0;
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
      if (nums[j] != nums[i]) {
        i++;
        nums[i] = nums[j];
      }
    }
    return i + 1;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 1, 2, 2, 3, 3, 4, 5, 6 };
    int newSize = removeDuplicates(nums);
    System.out.println("New size: " + newSize);
    System.out.println("New array: ");
    for (int i = 0; i < newSize; i++) {
      System.out.print(nums[i] + " ");
    }
  }

}
