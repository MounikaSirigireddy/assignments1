package com.omniwyse.assignments;

public class Pallindrome {

	public boolean findPallindrome(int n) {
		int r, sum = 0, temp;
		// It is the number variable to be checked for palindrome

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum) {

			System.out.println("palindrome number ");
			return true;
		} else
			System.out.println("not palindrome");
		return false;

	}

}
