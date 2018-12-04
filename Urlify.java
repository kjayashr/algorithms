    public static StringBuffer Url(String s)
    {
       StringBuffer sb = new  StringBuffer();
         //sb.append("");    //char ch = '%';
      for(int i =0 ; i<s.length();i++)
      {
          if((s.charAt(i) ==' '))
          {
           sb.append("%20");
          }
          else
          {
            sb.append(s.charAt(i));   
          }
      }
       
        return sb;
    }
/* you must be using some other method here */

/*lastseen: 12/03/2018 */
