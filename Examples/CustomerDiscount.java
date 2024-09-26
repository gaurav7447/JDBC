package com.Examples;
import java.util.Scanner;

	public class CustomerDiscount {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read the number of total strings
	        int N = scanner.nextInt();
	        scanner.nextLine(); // consume the newline character

	        // Read the name of the customer
	        String customerName = scanner.nextLine();

	        int discountCount = 0;

	        // Read the names of the items purchased
	        for (int i = 0; i < N - 1; i++) {
	            String itemName = scanner.nextLine();
	            // Check if the customer's name is a substring of the item name
	            if (itemName.contains(customerName)) {
	                discountCount++;
	            }
	        }

	        // Print the number of items eligible for discount
	        System.out.println(discountCount);

	        scanner.close();
	    }
	}



