package com.seattletechinterviews.strings.medium;

/**
 * Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.
 * 
 * For example, Given: s1 = "aabcc", s2 = "dbbca",
 * 
 * When s3 = "aadbbcbcac", return true. When s3 = "aadbbbaccc", return false.
 * 
 * 
 * @author rsalota
 *
 */
public interface InterleavingGenerator {
	public boolean canBeInterleaved(String s1, String s2 ,String s3);
}
