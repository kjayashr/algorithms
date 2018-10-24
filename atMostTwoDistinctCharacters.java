class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int end = 0; int begin = 0; int counter = 0;int maxlength = 1;int currentlength =0;
        if(s.equals("")||s == null)
            return 0;
        
 
        while(end < s.length())
        {
            char c = s.charAt(end);
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c)==1) counter ++;
            end ++;
            while(counter > 2)
            {
                 char temp = s.charAt(begin);
                 map.put(temp,map.get(temp)-1);
                 if(map.get(temp) == 0){ counter --;
                 }
                 
                //System.out.println(" Begin: "+temp + " End "+ c +" Counter:"+counter);
             begin ++;
                
                // System.out.println("Current Length :" +currentlength  );
                
            }
            currentlength =(end-begin);
                 maxlength = Math.max(currentlength,maxlength);
           // System.out.println("Max Length :" +maxlength  ); 
        }
        
        return maxlength;
    }
}
