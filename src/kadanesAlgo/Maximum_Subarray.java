package kadanesAlgo;

public class Maximum_Subarray {

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
//		int ans = withOutKadnes(nums);
		int ans =  withKadnes(nums);
		System.out.println(ans);
	}

	private static int withKadnes(int[] nums) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0;i<nums.length;i++) {
			sum += nums[i];
			max = Math.max(max,sum);
			if(sum < 0) sum = 0;
		}
		return max;
		
	}

	private static int withOutKadnes(int[] nums) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			int sum = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				sum += nums[j];
				max = Math.max(max, sum);
			}
		}
		return max;
	}

}
