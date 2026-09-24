import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write about yourself (4-5 sentences, more than 40 words");
        String autobiography = scanner.nextLine();

        System.out.println("Original text");
        System.out.println(autobiography);

        System.out.println("\n2. Count of the symbols (length()): " + autobiography.length());

        System.out.println("\n3.Convertation to UpperCase (toUpperCase()): " + autobiography.toUpperCase());

        System.out.println("\n4.Enter a word to check for its presence (contains()): ");
        String searchWord = scanner.nextLine();
        boolean containsWord = autobiography.contains(searchWord);
        System.out.println("The text contains the word \"" + searchWord + "\"? " + containsWord);

        int firstIndex = autobiography.indexOf(searchWord);
        System.out.println("\n5.Index of the first occurrence of the word (indexOf()): " + firstIndex);

        System.out.println("\n6. Enter a new word to replace it with. \"" + searchWord + "\" (replace()):");
        String replacementWord = scanner.nextLine();
        String modifiedText = autobiography.replace(searchWord, replacementWord);
        System.out.println("Text after replacing:\n" + modifiedText);

        int subEnd = Math.min(30, autobiography.length());
        System.out.println("\n7. The first part of the text (substring(0, " + subEnd + ")):");
        System.out.println(autobiography.substring(0, subEnd));

        String trimmedText = autobiography.trim();
        System.out.println("\n8. Text with removing unnecessary spaces (trim()):  ");
        System.out.println(trimmedText);

        String[] words = autobiography.trim().split("\\s+");
        System.out.println("\n9. The text has been successfully split into individual words. (split()). " + Arrays.toString(words));

    }
}