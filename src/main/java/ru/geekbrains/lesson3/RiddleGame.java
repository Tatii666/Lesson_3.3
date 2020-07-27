package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RiddleGame {
    public static final int Fake_Word_Length = 15;
    public static final String[] WORDS = new String[] {
            "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
            "olive", "pea", "peanut", "pear", "pepper", "pumpkin", "potato"
    };
    public static void main(String[] args) {
        System.out.println("Here is words. I'm made a word. Can you guess it: " + Arrays.toString(WORDS));
        Random random = new Random();
        int index = random.nextInt(WORDS.length);
        String targetWords = WORDS[index];
        String userWords = null;

        Scanner scanner = new Scanner();
        do {
            System.out.println("Write the word: ");
            userWords = scanner.nextLine();
            if (isWin(targetWords, userWords)) {
                System.out.println("You're WON!");
                break;
            }
            System.out.println("Mistake. I'll help you.");
            printPrompt(targetWords, userWords);
            System.out.println();

        } while (true);
        System.out.println("Game is over!");
    }
    private  static void printPrompt(String targetWords, String userWords) {
        for(int i = 0; i < Fake_Word_Length; i++) {
            char chr = '#';
            if (i < userWords.length() && i < targetWords.length() && userWords.charAt(i) == targetWords.charAt(i)){
                chr = userWords.charAt(i);
            }
            System.out.print(chr);
        }
    }


    private static boolean isWin(String targetWords, String userWords) {
        return targetWords.equals(userWords);
    }

}
