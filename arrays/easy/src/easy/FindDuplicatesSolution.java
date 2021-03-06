package easy;

import java.util.Arrays;
import java.util.HashMap;



public class FindDuplicatesSolution {
	
	//nlogn
	public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length == 0)
        return false;
        
        //sort array
        Arrays.sort(nums);
        
        int prevValue = 0;
        
        for(int i =0; i < nums.length; i++){
            if(i == 0){
                prevValue = nums[i];
                continue;
            }else{
                if(prevValue == nums[i])
                return true;
            }
            
        }
        return false;
    }
	
	
	//o(n) solution in time and space
	public boolean containsDuplicateFaster(int[] nums){
		
		if(nums == null || nums.length == 0){
			return false;
		}
		
		HashMap <Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
		
		for(int i : nums){
			if(map.containsKey(i)){
				return true;
			}
			
			map.put(i,i);
		}
		return false;
	}

}
