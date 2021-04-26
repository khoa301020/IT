import java.util.ArrayList;
import java.util.HashMap;
class CustomString {
    String str;
    public CustomString(String str) {
        this.str = str;
    }
    public String reverse() {
        String reverseString = "";
        for (int i = str.length() -1 ; i>=0; i-- ){
            reverseString = reverseString+str.charAt(i);
        }
        return reverseString;
    }
    public String toUpperCase() {
        String upperStr = "";
        for (int i = 0 ; i < str.length(); i++ ){
            char chr = str.charAt(i);
            int index = (int)chr;
            if (index >= 97 && index <= 122) {
                upperStr = upperStr+(char)(index-32);
            }
            else {
                upperStr = upperStr+chr;
            }
        }
        return upperStr;
    }
    public String toLowerCase() {
        String lowerStr = "";
        for (int i = 0 ; i < str.length(); i++ ){
            char chr = str.charAt(i);
            int index = (int)chr;
            if (index >= 65 && index <= 90) {
                lowerStr = lowerStr+(char)(index+32);
            }
            else {
                lowerStr = lowerStr+chr;
            }
        }
        return lowerStr;
    }
    public String toReverseCase() {
        String reverseCase = "";
        for (int i = 0 ; i < str.length(); i++ ){
            char chr = str.charAt(i);
            int index = (int)chr;
            if (index >= 65 && index <= 90) {
                reverseCase = reverseCase+(char)(index+32);
            }
            else if (index >= 97 && index <= 122) {
                reverseCase = reverseCase+(char)(index-32);
            }
            else {
                reverseCase = reverseCase+chr;
            }
        }
        return reverseCase;
    }
    public int countWords() {
        if (str.length() == 0) return 0;
        int count = 0;
        boolean meetSpace = false;
        for (int i = 0 ; i < str.length(); i++ ) {
            char chr = str.charAt(i);
            int index = (int)chr;
            if ((index >= 65 && index <= 90) || (index >= 97 && index <= 122)) {
                if (count == 0 || meetSpace) {
                    meetSpace = false;
                    count++;
                }
            }
            else if (chr == ' ') {
                meetSpace = true;
            }
        }
        return count;
    }
    public ArrayList words() {
        ArrayList<String> words = new ArrayList<String>();
        String currentWord = "";
        for (int i = 0 ; i < str.length(); i++ ) {
            char chr = str.charAt(i);
            int index = (int)chr;
            if ((index >= 65 && index <= 90) || (index >= 97 && index <= 122)) {
                currentWord = currentWord+chr;
            }
            else {
                if (currentWord.length() > 0) {
                    words.add(currentWord);
                }
                currentWord = "";
            }
        }
        if (currentWord.length() > 0) {
            words.add(currentWord);
        }
        return words;
    }
    public HashMap letterFrequency() {
        HashMap<Character, Integer> frequencies = new HashMap<Character, Integer>();
        for (int i = 0 ; i < str.length(); i++ ) {
            char chr = str.charAt(i);
            Integer charFreq = frequencies.get(chr);
            if (charFreq == null) {
                frequencies.put(chr,1);
            }
            else {
                frequencies.put(chr,++charFreq);
            }
        }
        return frequencies;
    }
}
