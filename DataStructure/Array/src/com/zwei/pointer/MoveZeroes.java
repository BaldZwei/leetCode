package com.zwei.pointer;

/**
 * @ClassName MoveZeroes
 * @Author awei
 * @Data 2023/7/17 16:22：
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 **/
public class MoveZeroes {
    public static void main(String[] args) {
        int [] arr ={0,1,0,3,0,4,0,5};
        int[] ints = moveZeroes(arr);
        for (int i = 0; i < ints.length-1; i++) {
            System.out.print(ints[i]);
            System.out.print(",");

        }
    }
    public static int[] moveZeroes(int[] nums) {
        if(nums.length==1||nums.length==0){
            return nums;
        }

        int slow=0;
        int fast=0;

        while(fast < nums.length){
            if(nums[fast] != 0){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        while(slow < nums.length ){
            nums[slow] =0;
            slow++;
        }
        return nums;
    }
}
