import java.util.*;
public class FindErrorNums {
	public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        int sum = (n * (n + 1)) / 2; // Sum of numbers from 1 to n

        for (int num : nums) {
            if (set.contains(num)) {
                result[0] = num; // Found the duplicate number
            }
            set.add(num);
            sum -= num; // Update the sum by subtracting each number
        }

        result[1] = sum + result[0]; // Missing number = sum - duplicate number

        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 2, 4 };
        int[] errorNums = findErrorNums(nums);
        System.out.println(Arrays.toString(errorNums));

	}

}
