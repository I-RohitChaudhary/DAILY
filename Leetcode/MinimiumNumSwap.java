public class MinimiumNumSwap {

    public static int minSwaps(int[] nums) {
        int n = nums.length;
        int countOnes = 0;

        // Count total number of 1's in the array
        for (int num : nums) {
            if (num == 1) {
                countOnes++;
            }
        }

        if (countOnes == 0 || countOnes == n) {
            // If there are no 1's or all are 1's, no swaps needed
            return 0;
        }

        // Calculate number of 1's in the initial window
        int currentOnes = 0;
        for (int i = 0; i < countOnes; i++) {
            if (nums[i] == 1) {
                currentOnes++;
            }
        }

        int maxOnesInWindow = currentOnes;

        // Sliding window approach
        for (int i = 1; i < n; i++) {
            // Update currentOnes by sliding the window
            currentOnes += nums[(i + countOnes - 1) % n] - nums[i - 1];
            maxOnesInWindow = Math.max(maxOnesInWindow, currentOnes);
        }

        // Minimum swaps required
        return countOnes - maxOnesInWindow;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 1, 0, 0, 1};
        System.out.println("Minimum swaps required: " + minSwaps(nums));
    }
}
