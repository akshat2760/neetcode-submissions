class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> go = new HashSet<>();
       for(int i = 0; i < nums.length;i++){
        if(go.contains(nums[i])){
            return true;
        }
        else{
            go.add(nums[i]);
        }
       }
       return false;

        
    }
}