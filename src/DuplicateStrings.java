import java.util.HashSet;

public class DuplicateStrings {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana"};
        HashSet<String> seen = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();

        for (String word : words) {
            if (!seen.add(word)) {
                duplicates.add(word);
            }
        }
        System.out.println("Duplicate values: " + duplicates);
    }
}

