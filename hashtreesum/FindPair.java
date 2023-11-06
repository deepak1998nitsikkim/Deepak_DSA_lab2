package com.greatlearning.hashtreesum;

import java.util.HashSet;
import java.util.Set;

public class FindPair {

	public void checkPairPresent(TreeNode root,int sum) {
		Set<Integer> set = new HashSet<>();
		if(!isPairPresent(root,sum,set)) {
			System.out.println("Pair not found for the given Sum: "+sum);
		}
	}

	private boolean isPairPresent(TreeNode root, int sum, Set<Integer> set) {
		if(root == null) {
			return false;
		}
		if(isPairPresent(root.left,sum,set)) {
			return true;
		}
		if(set.contains(sum - root.data)) {
			System.out.println("Pair is ("+ root.data +"," +(sum-root.data)+ ")");
		}else{
			set.add(root.data);
		}
		return isPairPresent(root.right,sum,set);
	}
	
}
