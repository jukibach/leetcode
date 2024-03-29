package containsDuplicate;

import java.util.*;

public class ContainsDuplicate {
	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for (int index = 0; index < nums.length; index++) {
			if (set.contains(nums[index]))
				return true;
			set.add(nums[index]);
		}
		return false;
	}
}
