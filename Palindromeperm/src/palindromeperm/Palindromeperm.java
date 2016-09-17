/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromeperm;

import java.util.HashMap;

/**
 *
 * @author Krishnakanth
 */


public class Palindromeperm {
    
    public static boolean permutation_check(String s1)
    {
       s1= s1.toLowerCase();
        HashMap <Character , Integer> hmap = new HashMap <Character , Integer>();
         
        for(int i=0; i<s1.length();i++)
        {
         if(hmap.containsKey(s1.charAt(i))) 
         {
            
            hmap.remove(s1.charAt(i));
         }
         else if(s1.charAt(i)!= ' ')
         {
         hmap.put(s1.charAt(i),1);  
        
         }
         
        }
         System.out.println(hmap);
        if(hmap.isEmpty() || hmap.size() ==1 )
        {
            return true;
        }
        else 
            return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean a = permutation_check("tact Coa");
        System.out.println(a);
        
    }
    
}
