package easy;

public class ONETwoSum {
	//Given an array of integers nums and an integer target, 
	//return indices of the two numbers such that they add up to target.		
	
	public static void main(String[] args) {
		int nums[] = {2,7,11,15};
		int target = 9;
		//information
		System.out.print("[");
		for(int i=0; i< nums.length; i++){
			System.out.print(nums[i]+" ");
		}
		System.out.println("]");
		System.out.println("target: "+ target);
		
		//search
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++){
				if(nums[i] + nums[j] == target){
					System.out.println(i+ " & " +j);
				}
			}	
		}
		// throw new IllegalArgumentException("no solution!");
	}

}
