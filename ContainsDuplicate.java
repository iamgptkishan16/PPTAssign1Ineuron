import java.util.HashSet;
public class ContainsDuplicate {
	public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true; // Found a duplicate
            }

            set.add(num);
        }

        return false; // No duplicates found
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 1 };
        boolean containsDuplicates = containsDuplicate(nums);
        System.out.println(containsDuplicates);

	}

}
