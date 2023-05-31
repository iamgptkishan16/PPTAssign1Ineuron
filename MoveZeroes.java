
public class MoveZeroes {
	public static void moveZeroes(int[] nums) {
        int index = 0;
        
        // Move all non-zero elements to the front of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        
        // Fill the remaining positions with zeroes
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        
        // Print the modified array
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

	}

}
