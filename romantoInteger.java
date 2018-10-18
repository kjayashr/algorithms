class Solution {
    private HashMap<Character,Integer> map = new HashMap<Character,Integer>()                  {{put('I',1);put('V',5);put('X',10);put('L',50);put('C',100);put('D',500);put('M',1000);} };
    
    public int romanToInt(String s) {
        int total = 0; int current  =0;int prev =0;
       for(char c: s.toCharArray())
       {
        current = map.get(c);   
        total+= (current>prev)?(current - 2*prev):current;
        prev = current;
    }
        return total;
    }
    
}
