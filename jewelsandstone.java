class Solution {
    public int numJewelsInStones(String J, String S) {
        int sum = 0;
        Set<Character> set = new HashSet<Character>();
        for(char c:J.toCharArray())
        {
            set.add(c);
        }
        
        for(char c:S.toCharArray())
        {
            if(set.contains(c))
            {
                sum++;
            }
        }
        return sum;
    }
}
