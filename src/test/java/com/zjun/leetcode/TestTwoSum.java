package com.zjun.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *  两数之和
 *
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 *
 *
 * 示例 1：
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 * 示例 2：
 *
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 *
 * 示例 3：
 *
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 *
 *
 * 提示：
 *
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * 只会存在一个有效答案
 * 进阶：你可以想出一个时间复杂度小于 O(n2) 的算法吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TestTwoSum {

    private TwoSum twoSum;

    @Before
    public void setup(){
        twoSum = new TwoSum();
    }

    @Test
    public void case1(){
        int[] input = {2,7,11,15};
        int target = 9;
        int[] rst = twoSum.twoSum(input, target);
        Assert.assertArrayEquals(new  int[]{0,1}, rst);
    }

    @Test
    public void case2(){
        int[] input = {3,2,4};
        int target = 6;
        int[] rst = twoSum.twoSum(input, target);
        Assert.assertArrayEquals(new  int[]{1,2}, rst);
    }

    @Test
    public void case3(){
        int[] input = {3,3};
        int target = 6;
        int[] rst = twoSum.twoSum(input, target);
        Assert.assertArrayEquals(new  int[]{0,1}, rst);
    }
}
