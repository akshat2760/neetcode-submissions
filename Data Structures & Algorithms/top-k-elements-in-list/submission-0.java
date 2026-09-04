class Solution {
    static class info implements Comparable<info>{
        int e;
        int f;
        public info(int e,int f){
            this.e = e;
            this.f = f;
        }
        @Override
        public int compareTo(info o){
            return o.f - this.f;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<info> pq = new PriorityQueue<>();
        int [] ans = new int[k];
        HashMap<Integer,Integer> go = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            go.put(nums[i],go.getOrDefault(nums[i],0) + 1);

        }
        for(int a:go.keySet()){
            pq.add(new info(a,go.get(a)));
        }
        int i = 0;
        while(k > 0){
            k--;
            ans[i] = pq.remove().e;
            i++;
        }
        return ans;
        
    }
}
