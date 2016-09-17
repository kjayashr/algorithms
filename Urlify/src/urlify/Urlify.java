/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urlify;

/**
 *
 * @author Krishnakanth
 */
public class Urlify {

    /**
     * 
     
     * @param args the command line arguments
     */
    
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
    public static void main(String[] args) {
        
        System.out.println(Url("an saar hengidira  "));
        // TODO code application logic here
    }
    
}
