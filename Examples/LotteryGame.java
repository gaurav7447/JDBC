package com.Examples;
import java.util.*;

public class LotteryGame {

    // Helper method to extract numeric part from the lottery code
    private static int extractNumber(String code) {
        StringBuilder number = new StringBuilder();
        for (char c : code.toCharArray()) {
            if (Character.isDigit(c)) {
                number.append(c);
            }
        }
        return Integer.parseInt(number.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of students
        int N = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        // Store the lottery codes and their extracted numbers
        List<String> lotteryCodes = new ArrayList<>();
        List<Integer> extractedNumbers = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String code = scanner.nextLine();
            lotteryCodes.add(code);
            extractedNumbers.add(extractNumber(code));
        }

        // Read the value of K
        int K = scanner.nextInt();

        // Create a list of indices from 0 to N-1
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            indices.add(i);
        }

        // Sort indices based on the extracted numbers
        indices.sort(Comparator.comparingInt(extractedNumbers::get));

        // Get the Kth smallest special code's index
        String result = lotteryCodes.get(indices.get(K - 1));

        // Output the lottery code with the Kth smallest special code
        System.out.println(result);

        scanner.close();
    }
}
