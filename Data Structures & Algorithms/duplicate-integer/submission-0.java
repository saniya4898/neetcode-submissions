class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(Integer num: nums){
            if(numSet.contains(num)){
                return true;
            }
            else{
                numSet.add(num);
            }
        }
        return false;
    }
}