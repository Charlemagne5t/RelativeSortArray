public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for (int i = 0; i < arr1.length; i++) {
            count[arr1[i]]++;
        }

        int[] res = new int[arr1.length];
        int j = 0;
        for (int i = 0; i < arr2.length; i++) {
            while (count[arr2[i]] != 0) {
                res[j++] = arr2[i];
                count[arr2[i]]--;
            }
        }
        for (int i = 0; i <= 1000; i++) {
            while (count[i] != 0) {
                res[j++] = i;
                count[i]--;
            }
        }
        return res;
    }
}
