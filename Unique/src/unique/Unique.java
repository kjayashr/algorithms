/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unique;

/**
 *
 * @author Krishnakanth
 */
public class Unique {

    /**
     * @param args the command line arguments
     */
    public static boolean iUnique ( String temp)
{
    temp = temp.toUpperCase();
  char[] array = temp.toCharArray();
  for (int i =0;i<(array.length)-1 ;i++) {
   for(int j= i+1;j<=array.length-1;j++)
    {
        System.out.println(i+ ","+j+"\n");
        if(array[i]== array[j])
        {
        System.out.println(array[i]);
        return false;
        }
    }
}
  return true;
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        String S = "Hogli";
        System.out.println(iUnique(S));
        
    }
    
}
