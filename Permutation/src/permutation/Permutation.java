/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutation;

import java.util.HashMap;

/**
 *
 * @author Krishnakanth
 */
public class Permutation {

    /**
     * @param args the command line arguments
     */
    
    public static boolean permutation_check(String s1, String s2)
    {
        if(s1.length()!= s2.length())
        {
            return false;
        }
        HashMap <Character , Integer> hmap = new HashMap <Character , Integer>();
         HashMap <Character , Integer> hmap2 = new HashMap <Character , Integer>();
        for(int i=0; i<s1.length();i++)
        {
         if(hmap.containsKey(s1.charAt(i))) 
         {
            int value  = hmap.get(s1.charAt(i));
            //System.out.println("hComming here");
            hmap.put(s1.charAt(i),value+1);
         }
         else
         hmap.put(s1.charAt(i),1);  
         
          //System.out.println("hgfhf"+hmap);
        }
            
        System.out.println(hmap);
         for(int i=0; i<s2.length();i++)
        {
         if(!hmap.containsKey(s2.charAt(i)))
         {
            System.out.println(hmap);
             return false;
            
         }
         if(hmap.containsKey(s2.charAt(i)))
         {
             if( hmap.get(s2.charAt(i)) == 0)
             {
              System.out.println(hmap);
              return false;
             }
             else {
            int value  = hmap.get(s2.charAt(i));
            hmap.put(s2.charAt(i),value-1);
             }
         }
         
         
          //System.out.println("hgfhf"+hmap);
        }
         
        
        
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        boolean a = permutation_check("abb", "aba");
        System.out.println(a);
    }
    
}
