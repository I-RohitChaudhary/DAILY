public class TwoNum {
    public static int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
    
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] result1 = twoSum(nums, 18);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");
    }
}
