class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        List<Integer> keyList = new ArrayList<>(map.keySet());

        keyList.sort((a,b)-> map.get(b)-map.get(a));

        int[] answer = new int[k];
        for(int i = 0 ; i<k; i++){
            answer[i] = keyList.get(i);
        }

        return answer;
    }
}
