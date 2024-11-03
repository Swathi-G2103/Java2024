package OCT23;

import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();

        System.out.println("Enter a number");
        int b = sc.nextInt();

        int result = sum_of_numbers(a, b);
        System.out.println("Sum is -> " + result);
        int result2 = sub_of_numbers(a, b);
        System.out.println("sub is -> " + result2);
        int result3 = mul_of_numbers(a, b);
        System.out.println("mul is -> " + result3);
        int result4 = modula_of_numbers(a, b);
        System.out.println("modula is -> " + result4);

    }

     static int modula_of_numbers(int a, int b) {
        return a%b;
    }


     static int mul_of_numbers(int a, int b) {
        return a*b;
    }

     static int sub_of_numbers(int a, int b) {
        return a-b;
    }

     static int sum_of_numbers(int a, int b) {
        return a+b;
    }
}
