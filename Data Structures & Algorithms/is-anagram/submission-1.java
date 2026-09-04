class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> go = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            go.put(s.charAt(i),go.getOrDefault(s.charAt(i),0) + 1);
        }
        for(int i = 0; i < t.length();i++){
            char tp = t.charAt(i);
            if(!go.containsKey(tp)){
                return false;
            }
            else{
                go.put(tp,go.get(tp) - 1);
                if(go.get(tp) == 0){
                    go.remove(tp);
                }
            }
            
        }
        return go.isEmpty();

    }
}
