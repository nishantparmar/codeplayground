package com.nishant.array;

public class MaxSubarray {

	public static void main(String[] args) {


		String word = "USA";

		char[] chars = word.toCharArray();
		
		System.out.println(Math.abs(100));
		
//		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
//		
//		MaxSubarray m =new MaxSubarray();
//		
//		int result = m.maxSubArray(nums);
//		
//		System.out.println(result);
//		
//		char[] chars = word.toCharArray();
//        
//        for(int i=0; i < chars.length ; i++){
//            
//            char ith = chars[i];
//            Character.isUpperCase(ith);
//            
//        }
		
	}

	public int crossSum(int[] nums, int left, int right, int p) {
		if (left == right)
			return nums[left];

		int leftSubsum = Integer.MIN_VALUE;
		int currSum = 0;
		for (int i = p; i > left - 1; --i) {
			currSum += nums[i];
			leftSubsum = Math.max(leftSubsum, currSum);
		}

		int rightSubsum = Integer.MIN_VALUE;
		currSum = 0;
		for (int i = p + 1; i < right + 1; ++i) {
			currSum += nums[i];
			rightSubsum = Math.max(rightSubsum, currSum);
		}

		return leftSubsum + rightSubsum;
	}

	public int helper(int[] nums, int left, int right) {
		if (left == right)
			return nums[left];

		int pivot = (left + right) / 2; // middle point

		int leftSum = helper(nums, left, pivot);
		int rightSum = helper(nums, pivot + 1, right);
		int crossSum = crossSum(nums, left, right, pivot);

		return Math.max(Math.max(leftSum, rightSum), crossSum);
	}

	public int maxSubArray(int[] nums) {
		return helper(nums, 0, nums.length - 1);
	}
}
