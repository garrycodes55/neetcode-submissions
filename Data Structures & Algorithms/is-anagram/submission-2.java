class Solution {
    public boolean isAnagram(String s, String t) {
HashMap<Character,Integer>map = new HashMap<>();
if(s.length()!=t.length())
return false;
for (char i:s.toCharArray()){ 
map.put(i,map.getOrDefault(i,0)+1);
    }
    for(char m:t.toCharArray())
    {
        if(map.containsKey(m))
        {
            map.put(m,map.get(m)-1);
            if(map.get(m)<0)
            return false;
        }
        else
        {
            return false;
        }

    }
for (int i: map.values()){ 
if(i!=0)
return false;
}
return true;

}
}