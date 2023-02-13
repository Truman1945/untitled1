import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// The code to use : Welcome to Object oriented programming and Data structure

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Split the input string into an array of words
        String[] words = input.split("\\s+");

        // Add the words to a TreeSet, which will automatically sort them in ascending alphabetical order
        Set<String> sortedWords = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        for (String word : words) {
            sortedWords.add(word);
        }

        // Print the sorted set
        for (String word : sortedWords) {
            System.out.println(word);
            System.out.println(123);
        }
    }}
