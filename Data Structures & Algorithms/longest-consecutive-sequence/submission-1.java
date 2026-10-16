class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if(n == 0) return 0;

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        int longest = 1;

        for(int a : set) {
            if(!set.contains(a-1)) {
                int count = 1;
                while(set.contains(a+1)) {
                    count++;
                    a++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
