class ConcatenationOfArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int x = 0;
        int y = n;
        
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                result[i] = nums[x++];
            } else {
                result[i] = nums[y++];
            }
        }
        return result;
    }
}