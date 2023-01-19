class Result {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String simpleCipher(String inputStr, int shiftKey)   
    {      
        inputStr = inputStr.toLowerCase();     
        StringBuilder decryptStr = new StringBuilder();   
        
        // precompute shifted characters
        char[] shiftedAlphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            int shiftPos = (i - shiftKey) % 26;
            if (shiftPos < 0) {
                shiftPos = ALPHABET.length() + shiftPos;
            }
            shiftedAlphabet[i] = ALPHABET.charAt(shiftPos);
        }

        for (int i = 0; i < inputStr.length(); i++)   
        {     
            int pos = ALPHABET.indexOf(inputStr.charAt(i));      
            char decryptChar = shiftedAlphabet[pos];   
            decryptStr.append(decryptChar);   
        } 

        inputStr = decryptStr.toString().toUpperCase();  
        return inputStr;   
    }
}