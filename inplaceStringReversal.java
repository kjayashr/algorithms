class Solution {
    public String reverseString(String s) {
        int n= s.length()-1;  char temp ;int i = 0;
       char[] sa = new char[s.length()];
        sa = s.toCharArray();
        while(i< n)
        {    
            temp = sa[i];
            sa[i] = sa[n];
            sa[n] = temp;  
            i++; n--;
        }
        return new String(sa);
    }
}

/*Inplace string reversal dude*/
