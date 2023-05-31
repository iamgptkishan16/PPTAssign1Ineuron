import java.util.Arrays;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
        int k = 0; // variable to store the number of elements not equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // overwrite the element at index k with the current element
                k++; // increment k
            }
        }

        return k;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        int[] nums = { 3, 2, 2, 3 };
	        int val = 3;

	        RemoveElement solution = new RemoveElement();
	        int k = solution.removeElement(nums, val);

	        System.out.println("Output: " + k + ", nums = " + Arrays.toString(nums));

	}

}
