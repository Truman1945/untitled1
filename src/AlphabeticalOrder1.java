import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AlphabeticalOrder1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Split the input string into an array of words
        String[] words = input.split("\\s+");

        // Create a queue and add the words to it
        Queue<String> queue = new LinkedList<>();
        for (String word : words) {
            queue.add(word);
        }

        // Sort the words in the queue in ascending alphabetical order
        for (int i = 0; i < queue.size(); i++) {
            for (int j = i + 1; j < queue.size(); j++) {
                String a = queue.toArray(new String[0])[i];
                String b = queue.toArray(new String[0])[j];
                if (a.compareToIgnoreCase(b) > 0) {
                    queue.remove(a);
                    queue.add(a);
                    queue.remove(b);
                    queue.add(b);
                }
            }
        }

        // Print the sorted words
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}