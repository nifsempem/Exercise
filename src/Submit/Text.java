package Submit;

public class Text {
    int totalChar = 0;
    int totalLn = 0;
    int totalNoOfWords = 0;
    String longestWord = "";

    public void countWord(String word) {
        totalChar += word.length();
        totalLn++;

        String[] wordsInline = word.split(" ");
        totalNoOfWords += wordsInline.length;

        for (String wordsNumber : wordsInline)
            if (wordsNumber.length() > longestWord.length())
                longestWord = wordsNumber;

    }
}















