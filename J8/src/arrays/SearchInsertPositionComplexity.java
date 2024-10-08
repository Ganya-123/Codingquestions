package arrays;

public class SearchInsertPositionComplexity {
  public int searchInsert(int[] nums, int target) {
    int left = 0, right = nums.length - 1;

    while (left <= right) {
      int mid = (right + left) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return left;
  }

  public static void main(String[] args) {
    SearchInsertPositionComplexity sol = new SearchInsertPositionComplexity();

    int[] nums1 = {1, 3, 5, 6};
    int target1 = 0;
        System.out.println(sol.searchInsert(nums1, target1)); // Output: 2
    //
    //    int[] nums2 = {1, 3, 5, 6};
    //    int target2 = 2;
    //    System.out.println(sol.searchInsert(nums2, target2)); // Output: 1
    //
    //    int[] nums3 = {1, 3, 5, 6};
    //    int target3 = 7;
    //    System.out.println(sol.searchInsert(nums3, target3)); // Output: 4
  }
}
