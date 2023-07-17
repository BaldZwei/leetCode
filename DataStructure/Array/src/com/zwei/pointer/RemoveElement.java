package com.zwei.pointer;

/**
 * @ClassName RemoveElement
 * @Author awei
 * @Data 2023/7/17 16:00：
 *
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 **/
public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,5,6};
        int val =4;
        int result= removeElement(arr,val);

        System.out.println(result);
    }
    public static int removeElement(int[] nums, int val) {
        int fast = 0, slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
