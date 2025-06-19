package JavaPrep;

import java.util.Scanner;

public class findThePrimeNum {

	public static boolean isPrimeNum(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println("the given num is primeNum:- "+isPrimeNum(16));
		
		
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int limit = scanner.nextInt();

        System.out.println("Prime numbers up to " + limit );
        for (int i = 2; i <= limit; i++) {
            if (isPrimeNum(i)) {
                System.out.print(i + " ");
            }
        }
		
		
		
		
	}

}
