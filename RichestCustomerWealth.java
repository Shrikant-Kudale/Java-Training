class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] customer : accounts) {
            int currentSum = 0;
            for (int bank : customer) {
                currentSum += bank;
            }
            if (currentSum > max) {
                max = currentSum;
            }
        }
        return max;
    }
}