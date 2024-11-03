package OCT21;

import java.util.Scanner;

public class taskReverseanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
       int reversenum = 0;
        for (; number != 0; number/=10) {
            int digit = number % 10;
            reversenum = reversenum * 10 + digit;
        }
        System.out.println("Reversed num "+ reversenum);
    }

}

