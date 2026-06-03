public class FindIndexInALinearArray {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        System.out.println(search(nums, 30));
    }

    public static int search(int[] n, int t) {
        for (int i = 0; i < n.length; i++) if (n[i] == t) return i;
        return -1;
    }
}