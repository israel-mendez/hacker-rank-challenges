class Result {
    public static String lastLetters(String word) {
        if (word.length() < 2){
            return word;
        }
        return word.substring(word.length()-1) + " " + 
        word.substring(word.length()-2, word.length()-1);
    }
}