class Solution {
    public int subarraySum(int[] nums, int k) {
        int count  =0;
        int s=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int right=0;right<nums.length;right++){
            s+=nums[right];
            if(map.containsKey(s-k)){
                count+=map.get(s-k);
            }
            map.put(s,map.getOrDefault(s,0)+1);
        }
        return count;
    }
}