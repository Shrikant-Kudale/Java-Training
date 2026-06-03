public class ReverseAnArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int n = nums.length;
        
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = nums[n - 1 - i];
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(reversed[i] + " ");
        }
    }
}