/*Handling overflow while reversing Java*/

class reverseOverFlow {
    public int reverse(int x) {

      
    int ret =0;   
    while(x!=0)
       {
            if (ret > Integer.MAX_VALUE/10 || ret == Integer.MAX_VALUE/10  && x > 7 ) return 0;
            if (ret < Integer.MIN_VALUE/10 || ret == Integer.MAX_VALUE/10 && x < -8 ) return 0;
        ret = ret*10+x%10;
       
          x = x/10;
          
       }
        return ret;
    }
}
