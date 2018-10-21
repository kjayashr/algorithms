/*Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.

Return the number of different transformations among all words we have.*/

class Solution {
    public int uniqueMorseRepresentations(String[] words) {

        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                         "....","..",".---","-.-",".-..","--","-.",
                         "---",".--.","--.-",".-.","...","-","..-",
                         "...-",".--","-..-","-.--","--.."};
        HashSet<String> hs = new HashSet<String>();
        for(String s:words)
        {
            StringBuilder codedWord = new StringBuilder();
            for(char c : s.toCharArray())
            {
                codedWord.append(MORSE[c-'a']);
            }
         hs.add(codedWord.toString());
        }
        return hs.size();
    }
}
