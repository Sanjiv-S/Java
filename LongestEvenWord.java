public class LongestEvenWord {
    
    public String longestEvenWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";
        
        for (String word : words) {
            if (word.length() % 2 == 0 && word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        return longestWord;
    }
    public static void main(String[] args) {
        LongestEvenWord lew = new LongestEvenWord();
        String sentence = "hello im sanjiv ";
        String longestEvenWord = lew.longestEvenWord(sentence); 
        System.out.println(longestEvenWord);
    }    
}
