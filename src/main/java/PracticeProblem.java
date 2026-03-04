import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
	}

	public static void q1() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String sentence = scanner.nextLine();
        boolean containsOn = sentence.toLowerCase().contains("on");
        System.out.println(containsOn);
		scanner.close();
	}

	public static void q2() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input the word mango: ");
        String input = scanner.nextLine().trim();
        boolean isMango = input.equalsIgnoreCase("mango");
        System.out.println(isMango);
		scanner.close();
	}

	public static void q3() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input a word: ");
        String word = scanner.nextLine().trim();
        System.out.print("Input a letter: ");
        char letter = scanner.nextLine().trim().charAt(0);

        int firstIndex = word.indexOf(letter);
        int lastIndex = word.lastIndexOf(letter);

        System.out.println(firstIndex);
        System.out.println(lastIndex);
		scanner.close();
	}

	public static void q4() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String sentence = scanner.nextLine();
        int length = sentence.length();
        System.out.println("Your sentence is " + length + " characters long");
		scanner.close();
	}

	public static void q5() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Input a word to replace: ");
        String oldWord = scanner.nextLine();
        System.out.print("What word would you like to replace it with: ");
        String newWord = scanner.nextLine();

        String result = sentence.replace(oldWord, newWord);
        System.out.println(result);
		scanner.close();
	}

	public static void q6() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String sentence = scanner.nextLine().trim();
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());
		scanner.close();
	}

	public static void q7() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input a word: ");
        String word = scanner.nextLine().trim();

        String firstFour = word.substring(0, Math.min(4, word.length()));
        String lastFour = word.substring(Math.max(0, word.length() - 4));

        System.out.println(firstFour);
        System.out.println(lastFour);
		scanner.close();
	}

	public static void q8() {
		//Write question 8 code here
	}

}
