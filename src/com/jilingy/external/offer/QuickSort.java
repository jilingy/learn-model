package com.jilingy.external.offer;

import java.util.Arrays;

/**
 * @author: YangJiling
 * @Description:
 * @date: 2022-06-28
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums={11,24,5,32,50,34,54,76};
        System.out.println("快速排序前:"+ Arrays.toString(nums));
//        quickSort(nums,0,nums.length-1);
        System.out.println("快速排序后:"+ Arrays.toString(nums));
    }
    public void quickSort(int[] nums){
        int start = 0 ;
        int end = nums.length-1;
        int pivot = nums[0];
        int[] left = {};
        int[] right = {};
        for (int num : nums) {
            if (num<=pivot){
            }
        }

    }
}
