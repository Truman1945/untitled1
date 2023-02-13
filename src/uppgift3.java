import java.util.*;

public class uppgift3 {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Read in the string
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        // Split the string into an array of words
        String[] words = str.split("\s+");

        // Create a queue to store the words
        Queue<String> queue = new LinkedList<>();

        // Add the words to the queue
        for (String word : words) {
            queue.add(word);
        }

        List<String> list = new LinkedList<>(queue);

        // Sort the words in descending alphabetical order
        Collections.sort(list);

        queue.clear();

        queue.addAll(list);

        // Print the words in the queue
        System.out.println("Words in descending alphabetical order: ");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}