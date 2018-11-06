class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails){
            String[]parts = email.split("@");
            String local = parseLocal(parts[0]);
            String domain = parts[1];
            set.add(local + '@' + domain);
        }
            return set.size();

    }
    
    
    String parseLocal(String local){
        StringBuilder sb = new StringBuilder();
        for (char c : local.toCharArray()){
            if (c != '.'){//Skip the period characters
                if (c == '+') return sb.toString(); //Ignore everything else
                sb.append(c); //Not a period and not a + character
            }
        }
        
        return sb.toString();
    }
    
}
