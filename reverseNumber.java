class Solution {
    public int reverse(int x) {
   
        int rev = 0; int prev =0;
        boolean negative = false;
        if(x<0) { x = x*-1; negative =true;}
        while(x > 0)
        {
            int digit = x%10;
            rev  = rev*10+digit;
            if((rev-digit)/10 != prev) return 0; //this is actually the previous formula itself
            prev = rev;
            x=x/10;
        }
        
        return negative?rev*-1:rev;
}
}
//Benki
