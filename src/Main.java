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

        //2.2

        System.out.println("Total number of words: " + words.length);

        String longestWord = words[0];
        String shortestWord = words[0];
        int countMoreThan4 = 0;

        for (String w : words) {
            String cleanWord = w.replaceAll("[^a-zA-Z]", "");
            String cleanLongest = longestWord.replaceAll("[^a-zA-Z]", "");
            String cleanShortest = shortestWord.replaceAll("[^a-zA-Z]", "");

            if (cleanWord.length() > cleanLongest.length()) {
                longestWord = w;
            }
            if (cleanWord.length() < cleanShortest.length() && cleanWord.length() > 0) {
                shortestWord = w;
            }
            if (cleanWord.length() > 4) {
                countMoreThan4++;
            }
        }
        System.out.println("The longest word: " + longestWord);

        System.out.println("The shortest word: " + shortestWord);

        System.out.println("Number of words longer than 4 characters: " + countMoreThan4);

        System.out.println("\nEnter a word to count how many times it appears in the text:");
        String countTarget = scanner.nextLine();
        int frequency = 0;
        for (String w : words) {

            String cleanW = w.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (cleanW.equals(countTarget.replaceAll("[^a-zA-Z]", "").toLowerCase())) {
                frequency++;
            }
        }
        System.out.println("Word \"" + countTarget + "\" appears in the text " + frequency + " time(s).");

        System.out.println("\nAll words in reverse order:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        System.out.println();

        //3



    }
}