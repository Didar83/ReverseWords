package learn.java.reversewords;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите фразу: ");
		String reverseThis = scanner.nextLine();
		System.out.println("Слова в обратном порядке: ");
		System.out.println(reverse(reverseThis));
		scanner.close();
		}
	
	public static String reverse (String input) {
		String inputWords[] = input.split(" ");
		String outputWords[] = new String[inputWords.length];
		int i = 0;
		for (String inputWord : inputWords) {
			String reverse = new StringBuilder(inputWord).reverse().toString();
			outputWords[i] = reverse;
			i++;
		}
		return String.join(" ", outputWords);
	}
}
