
class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> check = new HashSet<>();

       for(int i = 0; i<nums.length; i++){
        int nowNum = nums[i];

        if(check.contains(nowNum)){
            return true;
        }
        check.add(nowNum);
       }

       return false;
    }
}