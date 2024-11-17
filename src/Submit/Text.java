package Submit;

public class Text {
    int totalChar = 0;
    int totalLn = 0;

    public void countWord ( String word) {
        totalChar = word.length();
        totalLn++;
    }

}

