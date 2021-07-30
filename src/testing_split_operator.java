import java.io.*;

public class testing_split_operator {
    public static void main(String[] args) throws IOException {
        String wordsToSplit = "The quick brown fox jumped over the tall fence.";
        // Split the words in the sentence
        String[] words = wordsToSplit.split(" ");
        // Print the words
        for (String word : words) {
            System.out.println(word);
        }
    }
}
