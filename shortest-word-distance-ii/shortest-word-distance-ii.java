class WordDistance {
    Map<String,List<Integer>> map;
    public WordDistance(String[] wordsDict) {
        map = new HashMap<>();
        int index  = 0;
        for(String s : wordsDict)   {
            List<Integer> l = map.getOrDefault(s, new ArrayList<Integer>());
            l.add(index);
            map.put(s, l);
            index++;
        }
    }
    
    public int shortest(String word1, String word2) {
        List<Integer> l1 = map.get(word1);
        List<Integer> l2 = map.get(word2);
         
        int diff = 300000;
        for(int i = 0;i<=l1.size()-1;i++)  {
            for(int j = 0;j<=l2.size()-1;j++)  {
                diff = Math.min(diff, Math.abs(l2.get(j)-l1.get(i)));
            }
        }
        
        return diff;
    }
}

/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(wordsDict);
 * int param_1 = obj.shortest(word1,word2);
 */