class Solution {
    public void reverseString(char[] s) {
        int begin = 0;
        int end = s.length-1;
        while(begin<end)
        {
            swap(begin,end,s);
            begin++;
            end--;
        }
    }
    public void swap(int i,int j,char[] s )
        {
        char temp = s[i];
        s[i] = s[j];
        s[j]= temp;
    }
}
