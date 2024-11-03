package OCT2510;

import java.util.Scanner;

public class palindromechec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
                System.out.print("Enter a string: ");
                String input = sc.nextLine();

                boolean isPalindrome = true;

                int length = input.length();

                // Check each character from the start and the end
                for (int i = 0; i < length / 2; i++) {
                    if (input.charAt(i) != input.charAt(length - i - 1)) {
                        isPalindrome = false;
                        break;  // Exit the loop once a mismatch is found
                    }
                }

                if (isPalindrome) {
                    System.out.println("The string is a palindrome.");
                } else {
                    System.out.println("The string is not a palindrome.");
                }

                sc.close();
            }
        }



