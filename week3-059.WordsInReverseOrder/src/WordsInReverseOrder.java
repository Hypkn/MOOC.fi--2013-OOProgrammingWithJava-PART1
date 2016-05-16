
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while (true) {

            System.out.println("Type a word:");
            String word = reader.nextLine();

            if (word.isEmpty()) {

                System.out.println("You typed the following words: ");
                break;
            }

            words.add(word);

        }
        Collections.reverse(words);
        for (String addedWords : words) {
            System.out.println(addedWords);

        }

        {

        }
    }
}