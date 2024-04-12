import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int count = countLetterA(word, 0);
        System.out.println(count);
    }

    public static int countLetterA(String word, int index) {
        if (index >= word.length()) {
            return 0;
        }

        int currentCount;
        if (word.charAt(index) == 'a' || word.charAt(index) == 'A') {
            currentCount = 1;
        } else {
            currentCount = 0;
        }

        return currentCount + countLetterA(word, index + 1);
    }
}