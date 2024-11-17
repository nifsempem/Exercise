package Submit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Text countWords = new Text();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word or type Stop to exit program");

        String enteredWord;
        while (true) {
            enteredWord = scanner.next();
            if (enteredWord.equalsIgnoreCase("stop")) {
                System.out.println(" thank you");
                break;
            }
            countWords.countWord(enteredWord);
        }
        System.out.println("total character of the word entered is " + countWords.totalChar);
        System.out.println("Total number of lines = " + countWords.totalLn);
    }
}
