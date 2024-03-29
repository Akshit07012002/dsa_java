public class ShuffleTheArray1470 {
    public int[] shuffle(int[] nums, int n) {

        int[] a = new int[2 * n];

        for (int i = 0; i < n; i++) {
            a[2 * i] = nums[i];
            a[(2 * i) + 1] = nums[i + n];
        }

        return a;
    }
}
