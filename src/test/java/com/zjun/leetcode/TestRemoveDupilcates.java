package com.zjun.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * 删除排序数组中的重复项
 *
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 * 说明:
 *
 * 为什么返回数值是整数，但输出的答案是数组呢?
 * 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
 *
 * 示例 1：
 *
 * 输入：nums = [1,1,2]
 * 输出：2, nums = [1,2]
 * 解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
 *
 * 示例 2：
 *
 * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
 * 输出：5, nums = [0,1,2,3,4]
 * 解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。不需要考虑数组中超出新长度后面的元素。
 *
 * 提示：
 * 0 <= nums.length <= 3 * 104
 * -104 <= nums[i] <= 104
 * nums 已按升序排列
 *
 */
public class TestRemoveDupilcates {

    private RemoveDupilcates removeDupilcates;

    @Before
    public void setup(){
        removeDupilcates = new RemoveDupilcates();
    }

    @Test
    public void case1(){
        int[] nums = {1,1,2};
        int rst = removeDupilcates.removeDuplicates(nums);
        Assert.assertEquals(2, rst);
        Assert.assertArrayEquals(new int[]{1,2}, Arrays.copyOf(nums, rst));
    }

    @Test
    public void case2(){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int rst = removeDupilcates.removeDuplicates(nums);
        Assert.assertEquals(5, rst);
        Assert.assertArrayEquals(new int[]{0,1,2,3,4}, Arrays.copyOf(nums, rst));
    }
}
