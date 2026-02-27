class Q303_NumArray {
    @SuppressWarnings("FieldMayBeFinal")
    private int[] prefix;
    public Q303_NumArray(int[] nums) {

        if (nums.length == 0) {
            prefix = new int[0];
            return;
        }
        prefix = new int[nums.length];

        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
    }
    public int sumRange(int left, int right) {
        if (left > 0) {
            return prefix[right] - prefix[left - 1];
        } else {
            return prefix[right];
        }
    }
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 7};
        Q303_NumArray obj = new Q303_NumArray(nums);

        System.out.println(obj.sumRange(1, 3));  // Output: 16
    }
}