class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        Set<Integer> hs = new HashSet<>();
        for (int i : nums1) {
            hs.add(i);
        }
        Set<Integer> ans = new HashSet<>();
        for (int i : nums2) {
            if (hs.contains(i)) {
                ans.add(i);
            }
        }
        int[] ans1 = new int[ans.size()];
        int index = 0;
        for (int num : ans) {
            ans1[index++] = num;
        }

        return ans1;
    }
}
