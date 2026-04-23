class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs == null || strs.length ==0)
        return new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();
        for (String str:strs)
        {
            String key  = getFrequencyKey(str);
            if (map.containsKey(key))
            {
                map.get(key).add(str);
            }
            else
            {
                map.put(key, new ArrayList<>(List.of(str)));
            }

        }
        return  new ArrayList<>(map.values());

    }

    public String getFrequencyKey(String str)
    {
        int[] freq = new int[26];

        for (char c: str.toCharArray())
        {
            int count  =  c - 'a';
            freq[count]++;
        }
        return Arrays.toString(freq);
    }
}
