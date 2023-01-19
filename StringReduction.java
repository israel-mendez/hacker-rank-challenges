class Result {
    public static int getMinDeletions(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(charCount.containsKey(c)){
             charCount.put(c, charCount.get(c) + 1);   
            } else {
                charCount.put(c, 1);
            }
        }
        
        int deletions = 0;
        for(int count : charCount.values()){
            if (count > 1){
                deletions += count - 1;
            }
        }
        return deletions;
    }
}