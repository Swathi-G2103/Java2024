package OCT1710;

import java.sql.SQLOutput;
import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Percentage");
        int score = sc.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("Grade A");
        } else if (score <= 89 && score >= 80) {
            System.out.println("Grade B");
        } else if (score <= 79 && score >= 70) {
            System.out.println("Grade C");
        } else if (score <= 69 && score >= 60) {
            System.out.println("Grade D");
        } else if (score <= 59 && score >= 50)
        {
            System.out.println("Grade E");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}

