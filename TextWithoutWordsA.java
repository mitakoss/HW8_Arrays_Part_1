import java.util.Arrays;
import java.util.Scanner;

/*
Потребителят въвежда текст на английски език.
Изведете на конзолата същия текст, но без буквите
"А" и "а". Пример:
вход: Alligator are very dangerous animals.
изход: lligtor re very dngerous nimls.
 */
public class TextWithoutWordsA {
    public static void main(String[] args) {
        convertToChar(getWord());
    }

    public static String getWord(){
        String inputedText = null;
        Scanner text = new Scanner(System.in);
        System.out.println("Моля, въведете текст на английски език: ");
        inputedText = text.nextLine();

        return inputedText;
    }

    public static void convertToChar(String words){
        char[] letters = words.toCharArray();

        removingWordsA(letters);
    }

    public static void removingWordsA(char[] letters){
        char[] reserved = new char[letters.length];
        char wordA = 'A';
        char wordB = 'a';
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != wordA && letters[i] != wordB){
                reserved[i] = letters[i];
            }
        }
        convertToString(reserved);
    }

    public static void convertToString(char[] a){
        String normalText = String.valueOf(a);

        printResult(normalText);
    }

    public static void printResult(String result){
        System.out.println(result);
    }
}
