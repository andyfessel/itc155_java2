import java.awt.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class HwC13a1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {12, 123, 1, 28, 183, 16}; 
		System.out.println(Arrays.toString(nums));
		sortBigLast(nums);
		System.out.println(Arrays.toString(nums));

	}
	
	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	public static void sortBigLast(int[] nums) {
		for (int i = nums.length-1; i>=0; i--) {
			int largest = i;
			for (int j = i + 1; j<nums.length; j++) {
				if (nums[largest] > nums[j]) {
					largest = j;
				}
			}
			swap(nums, i, largest);
			//Arrays.sort(integer, Collections.reverseOrder());
			//Collections.sort(nums, Collections.reverseOrder());
			
			//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			//the method sort(List<T>, Comparator<? super T>) in the type Collections is
			//not applicable for the arguments (int[], Comparator<T>)

		}
	}

	
}


