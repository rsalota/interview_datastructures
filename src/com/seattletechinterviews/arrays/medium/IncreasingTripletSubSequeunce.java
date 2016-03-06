package com.seattletechinterviews.arrays.medium;

public interface IncreasingTripletSubSequeunce {
/**
 * 
Given an unsorted array return whether an increasing subsequence of length 3 exists or not in the array.

Examples:
Given [1, 2, 3, 4, 5], return true.

Given [5, 4, 3, 2, 1], return false.

	
Formally the function should:
Return true if there exists i, j, k  such that arr[i] < arr[j] < arr[k] given 0 ≤ i < j < k ≤ n-1 else return false.

*/
public boolean increasingTriplet(int[] nums);
}
