class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(char m:magazine.toCharArray())
        {
            map.put(m,map.getOrDefault(m,0)+1);
        }
        for(char r:ransomNote.toCharArray())
        {
          if(map.containsKey(r))
          {
              if(map.get(r) == 0)
              {
                  return false;
              }
              map.put(r,map.get(r)-1);
          }
            else
                return false;
        }
        return true;
    }
}

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
