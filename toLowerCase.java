class Solution {
    public String toLowerCase(String str) {
        char []c = str.toCharArray();
        for(int i = 0; i< c.length;i++)
        {
           if(c[i] >= 'A' && c[i] <= 'Z' )
           {
                c[i] = (char) (c[i] - 'A' + 'a');
           }
        }
        return new String(c);
    }
}
//ls01/02
