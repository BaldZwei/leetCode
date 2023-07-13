package com.zwei.pointer;

/**
 * @ClassName LongestPalindromicSubstring
 * @Author awei
 * @Data 2023/7/13 17:46：
 *
 * https://leetcode.cn/problems/remove-duplicates-from-sorted-array/
 * 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，
 * 返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
 * 考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：
 * 更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums 中出现的顺序排列。nums的其余元素与 nums 的大小不重要。
 * 返回 k
 *
 **/
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,4,4};
        int i = removeDuplicates(nums);
        System.out.println(i);
    }
    public static int removeDuplicates(int[] nums) {
            int n = nums.length;
            if (n == 0) {
                return 0;
            }
            int fast = 1, slow = 1;
            while (fast < n) {
                if (nums[fast] != nums[fast - 1]) {
                    nums[slow] = nums[fast];
                    ++slow;
                }
                ++fast;
            }
            return slow;
    }
}
